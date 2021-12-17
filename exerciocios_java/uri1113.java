package teste.java;

import java.util.Scanner;

public class uri1113 {

	public static void main(String[] args) {
		int x, y;
		try(Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
			y = leitor.nextInt();
			while(x != y){
				if (x < y){
					System.out.println("Crescente");
				}
				else{
					System.out.println("Decrescente");
				}
				x = leitor.nextInt();
				y = leitor.nextInt();
			}
		}
	}

}
