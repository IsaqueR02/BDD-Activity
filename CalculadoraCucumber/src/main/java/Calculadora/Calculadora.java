package calculadora;

public class Calculadora {
    public int calcular(int numero1, int numero2, String operacao) {
        return switch (operacao) {
            case "soma" -> numero1 + numero2;
            case "subtração" -> numero1 - numero2;
            case "multiplicação" -> numero1 * numero2;
            case "divisão" -> numero1 / numero2;
            default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
        };
    }
}