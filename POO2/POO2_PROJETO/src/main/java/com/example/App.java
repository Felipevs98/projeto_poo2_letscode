package com.example;

import java.time.LocalDate;
import java.util.List;

import com.example.Classes.Aluguel;
import com.example.Classes.Veiculo;
import com.example.Classes.Clientes.Cliente;
import com.example.Classes.Clientes.PessoaFisica;
import com.example.Classes.Clientes.PessoaJuridica;
import com.example.Classes.Veiculo.TipoVeiculo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App aplicacao = new App();

        aplicacao.cadatrarClientePF("Luiza", "648659721", "Feminino", LocalDate.of(1998, 02, 27));
        aplicacao.cadatrarClientePJ("Rafaela", "648659721", "Feminino", LocalDate.of(1998, 02, 27),"65872100001");
        aplicacao.cadatrarClientePJ("Felipe", "05648465723", "Feminino", LocalDate.of(1998, 02, 27),"65872100001");
        PessoaFisica pf = new PessoaFisica("Luiza", "648659721", "Feminino", LocalDate.of(1998, 02, 27));
        List<Cliente> oi = pf.getListaPessoas();

        pf.listarPessoas();
        oi.clear();
        System.out.println("pwsijgt");
        pf.listarPessoas();
        System.out.println("souidtgjh");

        

        // PessoaFisica luiza = new PessoaFisica("Luiza", "648659721", "Feminino", LocalDate.of(1998, 02, 27));
        // PessoaJuridica rafaela = new PessoaJuridica("Rafaela", "648659721", "Feminino", LocalDate.of(1998, 02, 27),"65872100001");
        // PessoaJuridica Felipe = new PessoaJuridica("Felipe", "05648465723", "Feminino", LocalDate.of(1998, 02, 27),"65872100001");
        // Veiculo up = new Veiculo("Up", TipoVeiculo.PEQUENO);
        // Veiculo blazer = new Veiculo("Blazer", TipoVeiculo.SUV);
        

        // Aluguel x = aplicacao.alugar(rafaela, blazer, 6);
        // aplicacao.valorAluguel(x);


    }

    public void cadatrarClientePF(String nome, String cpf, String genero, LocalDate dataNascimento){
        PessoaFisica pf = new PessoaFisica(nome, cpf, genero, dataNascimento);
        pf.addPessoas(pf);
    }
    public void cadatrarClientePJ(String nome, String cpf, String genero, LocalDate dataNascimento, String cnpj){
        PessoaJuridica pj = new PessoaJuridica(nome, cpf, genero, dataNascimento, cnpj);
        pj.addPessoas(pj);
    }

    public Aluguel alugar(Cliente cliente, Veiculo veiculo, int qtdDias){

        Aluguel Aluguel = new Aluguel(cliente, veiculo, qtdDias);
        return Aluguel;

    }

    public void valorAluguel(Aluguel aluguel){
        aluguel.calculaAluguel();
    }
}
