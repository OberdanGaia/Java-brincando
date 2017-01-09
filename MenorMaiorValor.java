package br.oberdan.brincando;

import java.util.Scanner;

public class MenorMaiorValor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] idades = new int[10];
		int ordem = 1;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite a idade da " + ordem + "º pessoa do vetor");
			idades[i] = input.nextInt();
			ordem++;
		}
		
		int menorValor = idades[0];
		int maiorValor = idades[0];
		int indexMaior = 0;
		int indexMenor = 0;

		for(int i = 1; i < idades.length; i++){
			if(idades[i] > maiorValor){
				maiorValor = idades[i];
				indexMaior = i;
				System.out.print("Entrou");
		}else if(idades[i] < menorValor){
				menorValor = idades[i];
				indexMenor = i;
				System.out.print("t");
		}
		}

		System.out.print("Vetor = ");
		for(int i = 0; i < idades.length; i++){
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Menor Idade: " +menorValor+ " e no indice: "+indexMenor);
		System.out.println("Maior Idade: " +maiorValor+ " e no indice: "+indexMaior);
	}

}
