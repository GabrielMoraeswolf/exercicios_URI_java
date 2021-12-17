package teste.java;

import java.util.Scanner;

public class uri1075 {

	public static void main(String[] args) {
		int n;
		try (Scanner leitor = new Scanner(System.in)) {
			n = leitor.nextInt();
		}
		for (int i = 1; i <= 10000; i++) {
			if (i % n == 2) {
				System.out.println(i);
			}
		}
	}

}
