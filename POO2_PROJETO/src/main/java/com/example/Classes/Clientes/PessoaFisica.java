package com.example.Classes.Clientes;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    
    public PessoaFisica(String nome, String cpf, String genero, LocalDate dataNascimento) {
        super(nome, cpf, genero, dataNascimento);
    }

    @Override
    public String toString() {
        return "PessoaFisica [nome: " + super.getGenero()
                + "CPF: " + super.getCpf()
                + "Gênero: " + super.getGenero()
                + "Data de Nascimento: " + super.getDataNascimento()+ "]";
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }

}
