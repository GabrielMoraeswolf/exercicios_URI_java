package teste.java;

import java.util.Scanner;

public class uri1133 {

	public static void main(String[] args) {
		int x ,y;
		try(Scanner leitor = new Scanner(System.in)){
			x = leitor.nextInt();
			y = leitor.nextInt();
		}
		if (x > y){
			int aux = x;
			x = y;
			y = aux;
		}
		for (int i = x+1; i < y; ++i){
			if (i % 5 == 2 || i % 5 == 3){
				System.out.println(i);
			}
		}

	}

}
