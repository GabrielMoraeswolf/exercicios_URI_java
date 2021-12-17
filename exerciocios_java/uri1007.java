package teste.java;
import java.io.IOException;
import java.util.Scanner;
public class uri1007 {
	  public static void main(String[] args) throws IOException {
		  int a , b ,c , d, total;
		  try (Scanner leitor = new Scanner(System.in)) {
			  a = leitor.nextInt();
			  b = leitor.nextInt();
			  c = leitor.nextInt();
			  d = leitor.nextInt();
			  }
	        
	        total = (a * b - c * d );
	  
	       System.out.println("DIFERENCA = " + total);    
	    }
}
