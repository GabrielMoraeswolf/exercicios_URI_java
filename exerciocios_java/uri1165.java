package teste.java;

import java.util.Scanner;

public class uri1165 {

	public static void main(String[] args) {
		int n, x, qtd;
		try(Scanner leitor = new Scanner(System.in)){
				n = leitor.nextInt();
	        for(int i = 0; i < n; i++){
	            x = leitor.nextInt();
	            qtd = 0;
	            for(int c = 1; c < x; c++){
	                if(x % c == 0) {
	                    qtd++;
	                }
	            }
	            if(qtd == 1) {
	                System.out.println(x + " eh primo");
	            }
	            else {
	            	System.out.println(x + " nao eh primo");
	            }
	        }     
        }

	}

}
