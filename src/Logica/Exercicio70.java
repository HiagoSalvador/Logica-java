package Logica;

import java.util.Scanner;

public class Exercicio70 {

	public static void main(String[] args) {
		// 70) Escreva um programa que leia um número inteiro e exiba a tabuada desse
		// número até o décimo valor.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		System.out.println("Tabuada do número " + numero + " até o décimo valor:");

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

		scanner.close();

	}

}
