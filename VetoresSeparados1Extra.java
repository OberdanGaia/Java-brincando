package br.oberdan.brincando;

import java.util.Scanner;

public class VetoresSeparados1Extra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int contB = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A de indice " + i);
			vetorA[i] = input.nextInt();

			if (vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
				contB++;
			}
			if (vetorA[i] % 2 == 0) {
				vetorA[i] = 0;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
