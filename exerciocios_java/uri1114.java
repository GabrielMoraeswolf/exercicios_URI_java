package teste.java;

import java.util.Scanner;

public class uri1114 {

	public static void main(String[] args) {
		int x;
		try(Scanner leitor = new Scanner(System.in)){
			x = leitor.nextInt();
			while(x != 2002){
				System.out.println("Senha Invalida");
				x = leitor.nextInt();
			}
			System.out.println("Acesso Permitido");
		}
	}

}
