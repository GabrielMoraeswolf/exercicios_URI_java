package teste.java;

import java.util.Scanner;

public class uri1160 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n, cont;
	    double a,b,x,t;
	    n = leitor.nextInt();
	    for(int i = 0; i < n; i++) {
	        cont = 0;
	        a = leitor.nextDouble();
	        b = leitor.nextDouble();
	        x = leitor.nextDouble();
	        t = leitor.nextDouble();
	        while(a <= b){
	            a = Math.floor(a+(a*(x / 100.0)));
                b = Math.floor(b+(b*(t / 100.0)));
	            cont++;
	            if (cont > 100){
	            	System.out.println("Mais de 1 seculo.");
	                break;
	            }
	        }
	        if (cont <= 100){
	        	System.out.println(cont + " anos." );
	        }
	    }
	}

}
