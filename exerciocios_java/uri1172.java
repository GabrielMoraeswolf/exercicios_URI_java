package teste.java;

import java.util.Scanner;

public class uri1172 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		try(Scanner leitor = new Scanner(System.in)){
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = leitor.nextInt();
				if(vetor[i] <= 0) {
					vetor[i] = 1;
				}
			}
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("X["+i+"] = "+vetor[i]);
			}
		}
	}

}
