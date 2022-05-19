import java.math.BigDecimal;

import desconto.CalculadoraDeDescontos;
import orcamento.Orcamento;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 6);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro)); 
        System.out.println(calculadora.calcular(segundo)); 
    }
}