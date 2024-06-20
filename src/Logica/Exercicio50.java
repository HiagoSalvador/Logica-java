package Logica;

import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		// 50) Crie um programa que leia o nome e a idade de várias pessoas usando o
		// loop "while" até que o nome "fim" seja informado. Ao final, exiba a média das
		// idades.

		Scanner scanner = new Scanner(System.in);

		int somaIdades = 0;
		int quantidadePessoas = 0;

		System.out.println("Digite o nome e a idade das pessoas (Digite 'fim' para encerrar):");

		String nome = "";
		while (!nome.equalsIgnoreCase("fim")) {
			System.out.print("Nome: ");
			nome = scanner.nextLine();

			if (!nome.equalsIgnoreCase("fim")) {
				System.out.print("Idade: ");
				int idade = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha

				somaIdades += idade;
				quantidadePessoas++;
			}
		}

		if (quantidadePessoas == 0) {
			System.out.println("Nenhuma pessoa foi inserida.");
		} else {
			double mediaIdades = (double) somaIdades / quantidadePessoas;
			System.out.printf("A média das idades das pessoas é: %.2f%n", mediaIdades);
		}

		scanner.close();

	}

}
