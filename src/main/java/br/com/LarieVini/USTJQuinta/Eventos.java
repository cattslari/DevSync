/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.LarieVini.USTJQuinta;

/**
 * Classe para representar um evento.
 */
import java.time.LocalDateTime;

public class Eventos {
    private int codigo;
    private String nome;
    private LocalDateTime dataHora;
    private String local;

    // Construtor padrão
    public Eventos() {}

    // Construtor com todos os atributos
    public Eventos(String nome, LocalDateTime dataHora, String local) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.local = local;
    }

    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}

