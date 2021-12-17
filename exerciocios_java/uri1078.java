package teste.java;

import java.util.Scanner;

public class uri1078 {

	public static void main(String[] args) {
		int x,rs;
		try(Scanner leitor = new Scanner(System.in)){
			x = leitor.nextInt();
		}
		for (int i = 1; i <= 10; ++i){
			rs = i * x;
			System.out.println(i +" x "+ x +" = "+ rs);
		}
	}
	
}
