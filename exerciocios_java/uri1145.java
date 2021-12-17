package teste.java;

import java.util.Scanner;

public class uri1145 {

	public static void main(String[] args) {
		int x,y;
		try(Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
			y = leitor.nextInt();
		}
		for (int i = 1; i <= y; i++) {
			System.out.print(i);
			if(i % x == 0) {
				System.out.println("");
			}
			else {
				System.out.print(" ");
			}
		}
	}

}
