package teste.java;

import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {
		int cont = 0;
		double mf,x = 0,md = 0;
		try(Scanner leitor = new Scanner(System.in)){
			while(x >= 0){		
				x = leitor.nextDouble();
				if (x >= 0){
					md += x;
					cont++;
				}
			}
		}
		mf = md /cont ;
		System.out.println(String.format("%.2f", mf));
	}

}
