package teste.java;

import java.util.Scanner;

public class uri1177 {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		int x,n = 0;
		try(Scanner leitor = new Scanner(System.in)){
			x = leitor.nextInt();
		}
		for (int i = 0; i < 1000; ++i){
			if(n == x){
				n = 0;
			}
			vetor[i] = n;
			System.out.println("N["+i+"] = "+vetor[i]);
			n++;
		}

	}

}
