package Logica;

import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		// 46) Escreva um programa que leia um número inteiro e exiba a soma de todos os
		// números pares entre 1 e o número lido usando o loop "while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		int somaPares = 0;
		int contador = 2; // Começa em 2 para garantir que o loop inclua o número 2 se for par

		while (contador <= numero) {
			if (contador % 2 == 0) {
				somaPares += contador;
			}
			contador++;
		}

		System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + somaPares);

		scanner.close();

	}

}
