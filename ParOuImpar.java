package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de praticar */

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor;
		
		System.out.print("Digite o valor desejado: ");
		valor = input.nextInt();
		
		if(valor % 2 == 0)
			System.out.println("Este é um valor Par");
		else
			System.out.println("Este é um valor Impar");
		}
		
	}


