package teste.java;

import java.util.Scanner;

public class uri1175 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x;
		int[] vetor = new int[20];
		int[] inverso = new int[20];
		for (int i = 0; i < vetor.length; i++) {
			x = leitor.nextInt();
			vetor[i] = x;
		}
		for (int i = 0; i < inverso.length; i++) {
			inverso[19-i] = vetor[i];
		}
		for (int i = 0; i < inverso.length; i++) {
			System.out.println("N["+i+"] = "+inverso[i]);
		}
	}

}
