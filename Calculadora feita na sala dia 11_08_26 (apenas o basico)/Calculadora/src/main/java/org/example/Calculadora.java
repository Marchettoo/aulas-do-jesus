package org.example;

public class Calculadora {

    public double calcular(double numeroA, double numeroB, char operador) {
        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = numeroA + numeroB;
                break;
            case '-':
                resultado = numeroA - numeroB;
                break;
            case '*':
                resultado = numeroA * numeroB;
                break;
            case '/':
                if (numeroB != 0) {
                    resultado = numeroA / numeroB;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }

        return resultado;
    }
}