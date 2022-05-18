package imposto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch(tipoImposto) {
        case ICMS:
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        case ISS:
            return orcamento.getValor().multiply(new BigDecimal("0.01"));
        default:
            return BigDecimal.ZERO;
        }
    }
}
