package teste.java;

import java.util.Scanner;

public class uri1115 {

	public static void main(String[] args) {
		int x,y;
		try(Scanner leitor = new Scanner(System.in)) { 
			x = leitor.nextInt();
			y = leitor.nextInt();
			while(x != 0 || y != 0) {	
				if(x > 0 && y > 0) {
					System.out.println("primeiro");
				}
				else if(x < 0 && y > 0) {
					System.out.println("segundo");
				}
				else if(x < 0 && y < 0) {
					System.out.println("terceiro");
				}
				else if(x > 0 && y < 0) {
					System.out.println("quarto");
				}
				x = leitor.nextInt();
				y = leitor.nextInt();
			}
		}
					
	}

}
