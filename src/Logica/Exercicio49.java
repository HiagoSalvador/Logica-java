package Logica;

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		// 49) Escreva um programa que calcule o fatorial de um número inteiro inserido
		// pelo usuário usando o loop "while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro para calcular o fatorial: ");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("Não é possível calcular o fatorial de um número negativo.");
		} else {
			int fatorial = 1;
			int contador = 1;

			while (contador <= numero) {
				fatorial *= contador;
				contador++;
			}

			System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}

		scanner.close();
	}

}
