package teste.java;

import java.util.Scanner;

public class uri1149 {

	public static void main(String[] args) {
		int a,n = 0,s = 0;
		try(Scanner leitor = new Scanner(System.in)){
			a = leitor.nextInt();
			while(n <= 0){
				n = leitor.nextInt();
				for (int i = 0; i < n; ++i){
					s += (a + i);
				}
			}
		}
		System.out.println(s);

	}

}
