package teste.java;

import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		int x,i;
		double n1,n2,n3,md;
		try(Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
			for (i = 0; i < x; ++i){
				n1 = leitor.nextDouble();
				n2 = leitor.nextDouble();
				n3 = leitor.nextDouble();
				md = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
				System.out.printf("%.1f\n",md);		
			}
		}
	}

}
