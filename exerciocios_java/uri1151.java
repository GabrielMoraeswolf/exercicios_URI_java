package teste.java;

import java.util.Scanner;

public class uri1151 {
	
	public static void main(String[] args) {
		int n,f = 0,x = 0;
		try(Scanner leitor = new Scanner(System.in)){
			n = leitor.nextInt();
		}
		for(int i = 0; i <= n-1; i++) {
	         if(i==1){
	           f = 1;
	           x = 0;
	          }
	          else{
	            f += x;
	            x = f - x;
	          }
	        if(i < n-1) {
	        	System.out.print(f+ " ");
	        }
	        else {
	        	System.out.println(f);
	        }
		}
	}
}
