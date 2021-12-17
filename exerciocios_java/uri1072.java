package teste.java;

import java.util.Scanner;

public class uri1072 {

	public static void main(String[] args) {
		int x,n,in = 0,out = 0;
		try (Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
		
			for (int i = 0; i < x; i++) {
			
				n = leitor.nextInt();
				if(n <= 20 && n >= 10) {
					in++;
				}
				else {
					out++;
				}
			}
		}
			System.out.println(in+" in");
		System.out.println(out+" out");
	}

}
