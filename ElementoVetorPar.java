package br.oberdan.brincando;

import java.util.Scanner;

public class ElementoVetorPar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int valor = 0;
		int quantPares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posi��o " + i + " do vetor");
			vetorA[i] = input.nextInt();
		}

		for (int j = 0; j < vetorA.length; j++) {
			if (vetorA[j] % 2 == 0) {
				System.out.println("O Valor " + vetorA[j] + " encontrado no indice " + j + " � par");
				quantPares++;
			}
		}

		if (quantPares == 0) {
			System.out.println("Este vetor s� possui valores impares");
		}

		System.out.print("Este vetor possui " + quantPares + " valores Pares");

	}
}
