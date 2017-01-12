package br.oberdan.brincando.recursivo;

import java.util.Scanner;

public class FatorialRecursivo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor que deseja descobrir o fatorial: ");
		int numero = input.nextInt();
		System.out.println("Resultado fatorial é " +fatorial(numero));
		

	}
	
	static int fatorial(int numero){
		
		if(numero == 0){
			return 1;
		}
		
		return numero * fatorial(numero - 1);
		
	}

}
