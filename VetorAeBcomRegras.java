package br.oberdan.brincando;

import java.util.Scanner;

public class VetorAeBcomRegras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do indice " + i + " do vetor");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}
		
	
		
		/*for(int j = 0; j < vetorA.length; j++){
			if(vetorA[j] % 2 == 0){
				vetorB[j] = 1;
			} else{
				vetorB[j] = 0;
			}
		}*/
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i] + " ");
		}

	}

}
