package me.dio.challenge.service.Smartphone;

import me.dio.challenge.exception.ProductAlreadyExistsException;
import me.dio.challenge.model.Fabricante;
import me.dio.challenge.model.Processador;
import me.dio.challenge.model.Smartphone;
import me.dio.challenge.repository.SmartphoneRepository;
import me.dio.challenge.service.Fabricante.FabricanteService;
import me.dio.challenge.service.Processador.ProcessadorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class SmartphoneService implements ISmartphoneService {
    @Autowired
    SmartphoneRepository repository;
    @Autowired
    ProcessadorService processadorService;
    @Autowired
    FabricanteService fabricanteService;

    private final Logger logger = LoggerFactory.getLogger(SmartphoneService.class);

    @Override
    public Smartphone criar(Smartphone data) {

        Processador novoProcessador = data.getHardware().getProcessador();

        Optional<Processador> processadorOptional = processadorService.buscarPeloModelo(novoProcessador.getModelo());

        if(processadorOptional.isPresent()) {
            logger.info("O processador já está presente no nosso banco de dados e não precisará ser salvo novamente!");
        } else {
            processadorService.criar(novoProcessador);
        }

        Optional<Fabricante> fabricanteOptional = fabricanteService.buscarPeloNome(data.getFabricante().getNome());

        if(fabricanteOptional.isPresent()) {
            logger.info("O fabricante já está presente no nosso banco de dados e não precisará ser salvo novamente!");
        } else {
            fabricanteService.criar(data.getFabricante());
        }

        List<Smartphone> smartphones = repository.findAll();

            for (Smartphone smartphone : smartphones) {
                if (Objects.equals(smartphone.getModelo(), data.getModelo())
                        && Objects.equals(smartphone.getFabricante().getNome(), data.getFabricante().getNome())) {
                    throw new ProductAlreadyExistsException("Já existe um smartphone desse modelo pertecente a esta marca.");
                }
            }

        return repository.save(data);

    }
}
