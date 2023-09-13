package me.dio.challenge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Processador {
    @Id
    @Column(unique = true)
    private String modelo;
    private String fabricante;
    private Float gigahertz;
    private Float quantidadeNucleos;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Number getGigahertz() {
        return gigahertz;
    }

    public void setGigahertz(Float gigahertz) {
        this.gigahertz = gigahertz;
    }

    public Float getQuantidadeNucleos() {
        return quantidadeNucleos;
    }

    public void setQuantidadeNucleos(Float quantidadeNucleos) {
        this.quantidadeNucleos = quantidadeNucleos;
    }
}
