package com.example.Classes.Clientes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

    private String nome;
    private String cpf;
    private String genero;
    private LocalDate dataNascimento;
    private static List<Cliente> listaPessoas = new ArrayList<>();

    public void listarPessoas() {
        for (Cliente cliente : listaPessoas) {
            System.out.println(cliente);
        }
    }

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

    public List<Cliente> getListaPessoas() {
        return listaPessoas;
    }

    public void addPessoas(Cliente pessoa) {
        listaPessoas.add(pessoa);
    }

    @Override
    public String toString() {
        return "Cliente [Nome: " + nome
        + " CPF: " + cpf
        + " Gênero: " + genero
        + " Data de Nascimento: " + dataNascimento+ "]";
    }        
    
}
