package teste.java;

import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		int n,x,y;
		double resul;
		try(Scanner leitor = new Scanner(System.in)){
			n = leitor.nextInt();
			for (int i = 0; i < n; ++i){
				x = leitor.nextInt();
				y = leitor.nextInt();
				if (y == 0){
					System.out.println("divisao impossivel");
				}
				else{
					resul = ((double)x / y);
					System.out.println(resul);
				}
			}
		}
	}

}
