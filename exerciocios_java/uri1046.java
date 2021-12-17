package teste.java;

import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		int hi,hf,result;
		try(Scanner leitor = new Scanner(System.in)){
			hi = leitor.nextInt();
			hf = leitor.nextInt();
			if (hi >= hf){
				result = (hf + 24) - hi;
			}
			else{
				result = (hf - hi);
			}
		}
		System.out.println("O JOGO DUROU "+result+" HORA(S)");
	}

}
