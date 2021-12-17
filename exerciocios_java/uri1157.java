package teste.java;

import java.util.Scanner;

public class uri1157 {

	public static void main(String[] args) {
		int n;
		try(Scanner leitor = new Scanner(System.in)){
			n = leitor.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
