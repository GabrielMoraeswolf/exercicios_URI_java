package teste.java;

import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		int x = 0,a = 0,g = 0,d = 0;
		while(x != 4){
			try (Scanner leitor = new Scanner(System.in)) {
				x = leitor.nextInt();
			}
			if (x == 1){
				a++;
			}
			else if (x == 2){
				g++;
			}
			else if (x == 3){
				d++;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ a);
		System.out.println("Gasolina: "+ g);
		System.out.println("Diesel: "+ d);
	}

}
