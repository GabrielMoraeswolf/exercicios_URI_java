package teste.java;

import java.util.Scanner;

public class uri1153 {

	public static void main(String[] args) {
		int x,cont = 1;
		try(Scanner leitor = new Scanner(System.in)){
			x = leitor.nextInt();
		}
		for (int i = 1; i < x; ++i){
			cont *= ((x+1) - i);
		}
		System.out.println(cont);
	}

}
