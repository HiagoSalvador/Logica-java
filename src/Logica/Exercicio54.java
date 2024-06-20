package Logica;

import java.util.Scanner;

public class Exercicio54 {

	public static void main(String[] args) {
		// 54) Faça um programa que leia 5 números inteiros usando o loop "do-while" e
		// exiba a média aritmética dos valores lidos.

		Scanner scanner = new Scanner(System.in);

		int soma = 0;
		int contador = 0;

		do {
			System.out.print("Digite um número inteiro: ");
			int numero = scanner.nextInt();
			soma += numero;
			contador++;
		} while (contador < 5);

		double media = (double) soma / contador;
		System.out.printf("A média aritmética dos valores lidos é: %.2f%n", media);

		scanner.close();

	}

}
