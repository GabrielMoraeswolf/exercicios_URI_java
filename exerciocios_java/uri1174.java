package teste.java;

import java.util.Scanner;

public class uri1174 {

	public static void main(String[] args) {
		double[] vetor = new double[10];
		try (Scanner leitor = new Scanner(System.in)) {
			for (int i = 0; i < vetor.length; i++) {		
				vetor[i] = leitor.nextDouble();
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] <= 10) {
				System.out.println("A["+i+"] = "+vetor[i]);
			}
		}
	}

}
