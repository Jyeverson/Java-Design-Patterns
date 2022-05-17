package orcamento;

import java.math.BigDecimal;

public class Orcamento{

    private BigDecimal valor;

    public Orcamento(BigDecimal valor){
        super();
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

}