package br.oberdan.brincando;

import java.util.Scanner;

public class VetorRandom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int valor1 = 0;
		int valor0 = 0;
		double percentual = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
		}
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] == 1){
				valor1++;
			} else if (vetorA[i] == 0){
				valor0++;
			}
		}
		
		percentual = (100 * valor1)/ vetorA.length;
		
		
		System.out.print("Vetor = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Percentual de numero(s) 1 é : " +percentual+"%");
		System.out.println("Percentual de numero(s) 0 é : " +(100-percentual)+ "%");

	}

}
