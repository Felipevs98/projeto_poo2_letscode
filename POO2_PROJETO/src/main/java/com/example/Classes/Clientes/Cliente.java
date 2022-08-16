package com.example.Classes.Clientes;

import java.time.LocalDate;

public abstract class Cliente {

    private String nome;
    private String cpf;
    private String genero;
    private LocalDate dataNascimento;
    
    

    public Cliente(String nome, String cpf, String genero, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }    
    
}
