package br.oberdan.brincando;

import java.util.Scanner;

public class CalculoSalarioSimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome do funcionário: ");
		String nome = input.nextLine();

		System.out.print("Digite o valor que ganha por hora em R$");
		double porHora = input.nextDouble();

		System.out.print("Digite quantas horas você trabalhou este mês: ");
		double horasTrabalhadas = input.nextDouble();

		double salarioTotal = (horasTrabalhadas * porHora);

		System.out.print(
				"O funcionário " + nome + " recebeu o total do salário no valor de R$" + salarioTotal + " este mês");

	}

}
