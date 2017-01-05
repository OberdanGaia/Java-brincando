package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de praticar */

public class MediaAluno {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double totalNotas = 0;
		double mediaFinal = 0;
		int j = 1;

		System.out.print("Digite o nome do Aluno: ");
		String nomeAluno = input.nextLine();

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a " + j + "º nota de 0 a 10 do Aluno: ");
			double nota = input.nextDouble();
			if (nota >= 0 && nota <= 10) {
				j++;
				totalNotas = (totalNotas + nota);
			} else{
				System.out.println("Valor de nota inválido, Favor digite novamente");
				i--;
			}
		}
		mediaFinal = (totalNotas / 4);

		System.out.print("A Media Final das 4 notas do aluno " + nomeAluno + " é: " + mediaFinal);

	}

}
