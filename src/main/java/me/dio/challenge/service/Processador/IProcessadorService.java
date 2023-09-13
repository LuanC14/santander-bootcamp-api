package me.dio.challenge.service.Processador;

import me.dio.challenge.model.Processador;

import java.util.Optional;

public interface IProcessadorService {

    public Processador criar(Processador processador);

    public Optional<Processador> buscarPeloModelo(String modelo);
}
