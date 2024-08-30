package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Verificar a ocorrência da letra 'a'");
        System.out.println("2. Verificar se um número pertence à sequência de Fibonacci");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 1) {
            System.out.print("Digite uma string para verificar a letra 'a': ");
            String texto = scanner.nextLine();
            int contador = contarLetraA(texto);

            if (contador > 0) {
                System.out.println("A letra 'a' ou 'A' foi encontrada " + contador + " vezes.");
            } else {
                System.out.println("A letra 'a' ou 'A' não foi encontrada.");
            }
        } else if (escolha == 2) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();
            if (pertenceAFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static int contarLetraA(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }

    public static boolean pertenceAFibonacci(int n) {
        if (n < 0) return false;
        int a = 0;
        int b = 1;
        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == n;
    }

}
