package me.dio.challenge.service.Fabricante;

import me.dio.challenge.model.Fabricante;

import java.util.Optional;

public interface IFabricanteService {
    Fabricante criar(Fabricante fabricante);

    Optional<Fabricante> buscarPeloNome(String nome);
}
