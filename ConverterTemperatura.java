package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de praticar */

public class ConverterTemperatura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double celsius;
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Double fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.printf("A Temperatura convertida para Celsius é de %.2f", celsius);
		
	}

}
