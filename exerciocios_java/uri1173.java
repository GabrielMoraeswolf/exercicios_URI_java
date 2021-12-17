package teste.java;

import java.util.Scanner;

public class uri1173 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		try(Scanner leitor = new Scanner(System.in)){
			int x = leitor.nextInt();
			int m = x;
			
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = m;
				x = m;
				System.out.println("N["+i+"]"+" = "+vetor[i]);
				m = (x * 2);
			}
		}
	}
}
