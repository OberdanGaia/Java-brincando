package br.oberdan.brincando;

import java.util.Scanner;

public class CalculoSalarioSimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome do funcion�rio: ");
		String nome = input.nextLine();

		System.out.print("Digite o valor que ganha por hora em R$");
		double porHora = input.nextDouble();

		System.out.print("Digite quantas horas voc� trabalhou este m�s: ");
		double horasTrabalhadas = input.nextDouble();

		double salarioTotal = (horasTrabalhadas * porHora);

		System.out.print(
				"O funcion�rio " + nome + " recebeu o total do sal�rio no valor de R$" + salarioTotal + " este m�s");

	}

}
