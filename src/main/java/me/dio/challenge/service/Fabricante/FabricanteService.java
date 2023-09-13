package me.dio.challenge.service.Fabricante;

import me.dio.challenge.model.Fabricante;
import me.dio.challenge.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class FabricanteService implements  IFabricanteService {
    @Autowired
    FabricanteRepository repository;

    @Override
    public Fabricante criar(Fabricante fabricante) {
        return repository.save(fabricante);
    }
    @Override
    public Optional<Fabricante> buscarPeloNome(String nome) {
        return repository.findById(nome);
    }
}
