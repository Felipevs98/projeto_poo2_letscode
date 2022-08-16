package com.example.Classes;

import java.math.BigDecimal;
import java.util.List;

import com.example.Classes.Clientes.Cliente;
import com.example.Classes.Clientes.PessoaFisica;
import com.example.Classes.Clientes.PessoaJuridica;

public class Aluguel {
    private Cliente cliente;
    private Veiculo veiculo;
    private int qtdDias;
    private BigDecimal desconto;
    private BigDecimal preco;
    private List<Aluguel> listaAlugueis;

    private enum Desconto {
        PF(BigDecimal.valueOf(0.05)), PJ(BigDecimal.valueOf(0.1));

        private final BigDecimal valor;

        Desconto(BigDecimal valorDesconto) {
            this.valor = valorDesconto;
        }

        public BigDecimal getValorDesconto() {
            return valor;
        }
    }

    public Aluguel(Cliente cliente, Veiculo veiculo, int qtdDias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.qtdDias = qtdDias;

        if (cliente instanceof PessoaFisica && qtdDias >= 5) {
            this.desconto = Desconto.PF.getValorDesconto();
        } else if (cliente instanceof PessoaJuridica && qtdDias > 3) {
            this.desconto = Desconto.PJ.getValorDesconto();
        }else{
            this.desconto = BigDecimal.ZERO;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public List<Aluguel> getListaAlugueis() {
        return listaAlugueis;
    }

    public void setListaAlugueis(Aluguel aluguel) {
        this.listaAlugueis.add(aluguel);
    }

    public BigDecimal calculaAluguel() {

        this.preco = this.veiculo.getPrecoAluguel().multiply(BigDecimal.valueOf(1).subtract(desconto));
        return preco;

    }

    @Override
    public String toString() {
        return "Aluguel [cliente = " + cliente + ", desconto = " + desconto + ", preco = " + preco + ", qtdDias = " + qtdDias
                + ", veiculo = " + veiculo + "]";
    }
  

}
