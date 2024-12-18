package Logica;

import java.util.Scanner;

public class Exercicio108 {

	public static void main(String[] args) {
		// 108)Faça um programa que leia uma matriz 4x4 de números inteiros e exiba o
		// maior valor presente em cada linha

		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[4][4];

		System.out.println("Digite os elementos da matriz 4x4:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Maior valor em cada linha:");
		for (int i = 0; i < 4; i++) {
			int maiorValorLinha = matriz[i][0];
			for (int j = 1; j < 4; j++) {
				if (matriz[i][j] > maiorValorLinha) {
					maiorValorLinha = matriz[i][j];
				}
			}
			System.out.println("Linha " + i + ": " + maiorValorLinha);
		}

		scanner.close();

	}

}
