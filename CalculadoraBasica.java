package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de praticar */

public class CalculadoraBasica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int operador, ordem = 1;
		double valor = 1, resultado = 0, valor2 = 0;

		System.out.println("Digite o operador Matem�tico deseja utilizar\n" + "Digite 1 para SOMAR\n"
				+ "Digite 2 para SUBTRAIR\n" + "Digite 3 para MULTIPLICAR\n" + "Digite 4 para DIVIDIR");
		operador = input.nextInt();

		switch (operador) {
		case 1:
			System.out.println("Escolhido Soma de valores");
			while (valor != 0) {
				System.out.println("Digite o " + ordem + "� valor para somar\n" + "e Digite 0 para parar...");
				valor = input.nextDouble();
				resultado = (resultado + valor);
				ordem++;

			}
			System.out.println("Resultado total da somat�ria = " + resultado);
			break;

		case 2:
			System.out.println("Escolhido Subtra��o de valores");
			System.out.println("Digite o primeiro valor");
			valor = input.nextDouble();
			System.out.println("Digite o segundo valor");
			valor2 = input.nextDouble();
			
			resultado = (valor - valor2);
			System.out.println("Resultado final da subtra��o = " + resultado);
			break;
		case 3:
			System.out.println("Escolhido Multiplica��o de valores");
			System.out.println("Digite o primeiro valor");
			valor = input.nextDouble();
			System.out.println("Digite o segundo valor");
			valor2 = input.nextDouble();
			
			resultado = (valor * valor2);
			System.out.printf("Resultado total da somat�ria = %.4f",resultado);
			break;
		case 4:
			System.out.println("Escolhido Divis�o de valores");
			System.out.println("Digite o primeiro valor");
			valor = input.nextDouble();
			System.out.println("Digite o segundo valor");
			valor2 = input.nextDouble();
			
			resultado = (valor / valor2);
			System.out.printf("Resultado da divis�o = %.4f",resultado);
			break;
		default:
			System.out.println("Este � um operador n�o valido");
		}
		
			
			
		}

	}


