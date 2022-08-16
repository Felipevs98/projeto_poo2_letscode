package com.example.Classes;

import java.math.BigDecimal;

public class Veiculo {

    private String modelo;
    private BigDecimal precoAluguel;
    private TipoVeiculo tipoVeiculo;

    public enum TipoVeiculo {

        PEQUENO(BigDecimal.valueOf(100)), MEDIO(BigDecimal.valueOf(150)), SUV(BigDecimal.valueOf(200));
            
            private final BigDecimal valor;
    
            TipoVeiculo(BigDecimal precoUmVeiculo){
                valor = precoUmVeiculo;
            }
    
            public BigDecimal getPrecoUmVeiculo(){
                return valor;
            }      
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public BigDecimal getPrecoAluguel() {
        return precoAluguel;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", precoAluguel=" + precoAluguel + ", tipoVeiculo=" + tipoVeiculo + "]";
    }

    public Veiculo(String modelo, TipoVeiculo tipoVeiculo) {
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;

        switch (tipoVeiculo) {
            case PEQUENO:
                this.precoAluguel = tipoVeiculo.getPrecoUmVeiculo();
                break;
        
            case MEDIO:
                this.precoAluguel = tipoVeiculo.getPrecoUmVeiculo();
                break;
                
            case SUV:
                this.precoAluguel = tipoVeiculo.getPrecoUmVeiculo();
                break;

            default:
                break;
        }
    }
}


