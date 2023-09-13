package me.dio.challenge.repository;

import me.dio.challenge.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {
    List<Smartphone> findByModelo(String modelo);

}
