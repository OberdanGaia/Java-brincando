package br.oberdan.brincando;

import java.util.Scanner;

/* Feito por Oberdan Gaia com finalidade de praticar */

public class LoginDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String loginUserDB = "Oberdan";
		String senhaUserDB = "senhaTeste";
		boolean valida = false;
		String loginView;
		String senhaView;
		
		do{
			System.out.print("Digite o Login de Usuário: ");
			loginView = input.next();
			System.out.print("Digite a Senha de Usuário: ");
			senhaView = input.next();
			
			if((loginView.equalsIgnoreCase(loginUserDB)) && (senhaView.equalsIgnoreCase(senhaUserDB))){
				System.out.print("Login efetuado com sucesso!!");
				valida = true;
			}else{
				System.out.print("Usuário ou senha inválidos!\n"
						+ "Tente novamente.\n\n");
			}
			
		}while(!valida);
		

	}

}
