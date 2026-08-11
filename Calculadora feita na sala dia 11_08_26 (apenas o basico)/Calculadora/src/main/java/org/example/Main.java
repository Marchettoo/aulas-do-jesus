package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        double numeroA = scanner.nextDouble();

        System.out.println("Informe o segundo numero: ");
        double numeroB = scanner.nextDouble();

        System.out.println("Informe o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        Calculadora calc = new Calculadora();

        double resultado = calc.calcular(numeroA, numeroB, operador);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}