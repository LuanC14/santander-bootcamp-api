package me.dio.challenge.repository;

import me.dio.challenge.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, String> {
}
