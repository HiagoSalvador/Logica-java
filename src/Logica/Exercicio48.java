package Logica;

import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		// 48)Faça um programa que leia um número inteiro e exiba os seus dígitos
		// separadamente usando o loop "while".

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();

		if (numero == 0) {
			System.out.println("0");
			return;
		}

		int digitoAtual;
		while (numero > 0) {
			digitoAtual = numero % 10;
			System.out.print(digitoAtual + " ");
			numero /= 10;
		}
	}
}
