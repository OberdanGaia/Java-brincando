package br.oberdan.brincando;

import java.util.Scanner;

public class NumerosPalindromos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean palindromo = true;

		int[] vetorA = new int[10];
		int metade = vetorA.length / 2;
		// Numeros Palindromos são aqueles que são escritos da direita para a
		// esquerda e tem o mesmo valor caso escritos da direita para esquerda

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice " + i + " do vetor");
			vetorA[i] = input.nextInt();
		}

		for (int j = 0; j < metade; ++j) {
			if (vetorA[j] != vetorA[vetorA.length - 1 - j]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		if (palindromo) {
			System.out.println("É um número Palindromo!");
		} else {
			System.out.println("Não é um número Palindromo!");
		}
	}

}
