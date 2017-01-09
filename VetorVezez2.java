package br.oberdan.brincando;

import java.util.Scanner;

public class VetorVezez2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		vetorA[0] = 0;
		vetorA[1] = 1;
		vetorA[2] = 2;
		vetorA[3] = 3;
		vetorA[4] = 4;
		
		
		/*for(int i = 0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da posição: " +i);
			valor = input.nextInt();
			vetorA[i] = valor;
			vetorB[i] = vetorA[i] * 2 ;
			//Multiplica o valor do vetor vezez 2
			
			System.out.println("Vetor A "+i+" valor:" + vetorA[i]);
			System.out.println("Vetor B "+i+" valor:" + vetorB[i]);	
			}*/
		
		
		/*for(int i = 0; i<vetorA.length; i++){
			System.out.println("Entre com o valor da posição: " +i);
			valor = input.nextInt();
			vetorA[i] = valor;
			vetorB[i] = vetorA[i] * i ;
			//Multiplica o valor dentro do vetor A com o seu Indice
			
			System.out.println("Vetor A "+i+" valor:" + vetorA[i]);
			System.out.println("Vetor B "+i+" valor:" + vetorB[i]);	

	}*/

}
}
