package Logica;

public class Exercicio52 {

	public static void main(String[] args) {
		// 52) Escreva um programa que calcule a soma dos números de 1 a 100 usando o
		// loop "do-while

		int numero = 1;
		int soma = 0;

		do {
			soma += numero;
			numero++;
		} while (numero <= 100);

		System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
