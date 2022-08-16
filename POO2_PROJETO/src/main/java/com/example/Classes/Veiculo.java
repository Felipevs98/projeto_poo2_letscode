package com.example.Classes;

import java.math.BigDecimal;

public class Veiculo {

    private String modelo;
    private BigDecimal precoAluguel;
    private String tipo;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Veiculo(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
    }  

    public BigDecimal getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(TipoVeiculo tipoVeiculo) {
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
}


