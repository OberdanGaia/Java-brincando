package br.oberdan.brincando;

import java.util.Scanner;

public class VetoresComRegras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do vetor A de indice " + i);
			vetorA[i] = input.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o valor do vetor B de indice " + i);
			vetorB[i] = input.nextInt();
			
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;

			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++){
			System.out.print(vetorC[i] + " ");
		}
		
		System.out.println();
	}

}
