package com.example.Classes.Clientes;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String cpf, String genero, LocalDate dataNascimento, String cnpj) {
        super(nome, cpf, genero, dataNascimento);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [Nome: " + super.getGenero()
                + " CPF: " + super.getCpf()
                + " Gênero: " + super.getGenero()
                + " Data de Nascimento: " + super.getDataNascimento()
                + " CNPJ: " + cnpj + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PessoaJuridica other = (PessoaJuridica) obj;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        return true;
    }

}
