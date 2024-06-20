package Logica;

import java.util.Scanner;

public class Exercicio55 {

	public static void main(String[] args) {
		// 55) Escreva um programa que leia um número inteiro e exiba a tabuada desse
		// número até o décimo valor usando o loop "do-while".

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		int contador = 1;

		System.out.println("Tabuada de " + numero + ":");

		do {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			contador++;
		} while (contador <= 10);

		scanner.close();

	}

}
