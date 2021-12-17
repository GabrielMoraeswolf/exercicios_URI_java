package teste.java;

import java.util.Scanner;

public class uri1178 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double[] vetor = new double[100];
		double x = leitor.nextDouble();
		double n = x;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = n;
			System.out.println("N["+i+"] = "+String.format("%.4f",vetor[i]));
			x = n;
			n = (x / 2);
		}
	}

}
