package me.dio.challenge.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Hardware {
    @Embedded
    @ManyToOne
    @JoinColumn(name = "processador_modelo")
    private Processador processador;
    private Float memoriaRam;
    private Float armazenamento;

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Float getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Float memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Float getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Float armazenamento) {
        this.armazenamento = armazenamento;
    }
}
