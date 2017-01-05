package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de praticar */

public class CalculaIMC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double peso, altura, imc;

		System.out.print("Digite sua Altura em metros: ");
		altura = input.nextDouble();

		System.out.print("Digite seu Peso em quilograma: ");
		peso = input.nextDouble();

		imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é de: %.2f \n", imc);
		if (imc < 20)
			System.out.println("Você está a baixo do peso");
		else if ((imc >= 20) && (imc < 25))
			System.out.println("Você está com o peso normal");
		else if ((imc >= 25) && (imc < 30))
			System.out.println("Você está acima do peso");
		else if ((imc >= 30) && (imc < 34))
			System.out.print("Você está obeso, cuidado com a saúde");
		else
			System.out.printf("Voce está muito obeso, melhore seu estilo de vida já!!");
	}

}
