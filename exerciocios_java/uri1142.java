package teste.java;

import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {
		int x;
		try(Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
		}
		for (int i = 1; i <= (x * 4) ; ++i){
			if (i % 4 == 0){
				System.out.println("PUM");
			}
			else{
				System.out.print(i+" ");

			}
		}
	}

}
