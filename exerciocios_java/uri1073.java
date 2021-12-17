package teste.java;

import java.util.Scanner;

public class uri1073 {

	public static void main(String[] args) {
		int x,r;
		try(Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
		}
		for (int i = 1; i <= x; ++i){
			if (i % 2 == 0){
				r = (i * i);
				System.out.println(i +"^2 = "+r);
			}
		}
	}

}
