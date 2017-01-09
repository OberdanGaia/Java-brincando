package br.oberdan.brincando;

import java.util.Scanner;

public class CheckVetorPar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int ordem = 1;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + ordem + "º valor do vetor");
			vetorA[i] = input.nextInt();
			ordem++;

			if (vetorA[i] % 2 != 0) {
				System.out.println("Valor impar encontrado");
				break;
			}

		}

	}

}
