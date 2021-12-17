package teste.java;

import java.util.Scanner;

public class uri1150 {

	public static void main(String[] args) {
		try(Scanner leitor = new Scanner(System.in)){
			int x ,z,cont = 0,sm = 0;
			x = leitor.nextInt();
			z = leitor.nextInt();
			while(x >= z){
				z = leitor.nextInt();
			}
		
			while (sm < z) {
		        sm += x;
		       	cont++;
		      	x++;
		    }
			System.out.println(cont);
		}
	}

}
