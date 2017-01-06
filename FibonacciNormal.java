package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de praticar */

public class FibonacciNormal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Serie fibonacci = 1,1,2,3,5,8,13....
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		int numero;
		
		System.out.print("Digite o n-ésimo termo da série de Fibonacci: ");
		numero = input.nextInt();
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int n=3; n<=numero;n++){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
		
	}

}
