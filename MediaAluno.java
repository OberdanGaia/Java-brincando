package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de treino */

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double totalNotas = 0;
		double mediaFinal = 0;
		int j = 1;
		
		System.out.print("Digite o nome do Aluno: ");
		String nomeAluno = input.nextLine();
		
		for(int i = 0; i < 4; i++){
			System.out.print("Digite a " +j+ "º nota do Aluno: ");
			double nota = input.nextDouble();
			j++;
			
			totalNotas = (totalNotas + nota);
			
		}
		mediaFinal = (totalNotas / 4);
		
		System.out.print("A Media Final das 4 notas do aluno " +nomeAluno+ " é: "+mediaFinal);
		
	}

}
