package steps;

import calculadora.Calculadora;
import io.cucumber.java.pt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private int numero1;
    private int numero2;
    private String operacao;
    private int resultado;
    private Calculadora calculadora;

    @Dado("que {string} esteja na calculadora")
    public void que_esteja_na_calculadora(String usuario) {
        calculadora = new Calculadora();
    }

    @Quando("pressionar o {int}")
    public void pressionar_o_numero1(int num) {
        if (numero1 == 0) {
            numero1 = num;
        } else {
            numero2 = num;
        }
    }

    @E("escolher a {string}")
    public void escolher_a_operacao(String op) {
        this.operacao = op;
    }

    @Então("o sistema devera mostrar o {int}")
    public void o_sistema_devera_mostrar_o_resultado(int esperado) {
        resultado = calculadora.calcular(numero1, numero2, operacao);
        assertEquals(esperado, resultado);
    }
}