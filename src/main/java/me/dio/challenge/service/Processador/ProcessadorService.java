package me.dio.challenge.service.Processador;

import me.dio.challenge.model.Processador;
import me.dio.challenge.repository.ProcessadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProcessadorService implements IProcessadorService {

    @Autowired
    ProcessadorRepository repository;

    @Override
    public Processador criar(Processador data) {
        return repository.save(data);
    }

    @Override
    public Optional<Processador> buscarPeloModelo(String modelo) {
        return repository.findById(modelo);
    }
}
