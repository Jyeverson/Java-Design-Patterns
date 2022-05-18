package imposto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS())); 
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}