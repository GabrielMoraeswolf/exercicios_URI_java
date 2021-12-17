package teste.java;

import java.util.Scanner;

public class uri1132 {

	public static void main(String[] args) {
		int x,y,result = 0;
		try(Scanner leitor = new Scanner(System.in)){
			x = leitor.nextInt();
			y = leitor.nextInt();
		}
		if(x > y) {
			int aux = x;
			x = y;
			y = aux;
		}
		for (int i = x; i <= y; i++) {
			if (i % 13 != 0) {
				result += i;
			}
		}
		System.out.println(result);
	}

}
