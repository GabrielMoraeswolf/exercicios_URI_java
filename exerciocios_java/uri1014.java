package teste.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1014 {
	public static void main(String[] args) {
		int x;
		double y,result;
		try (Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
			y = leitor.nextDouble(); 
		}
			result = (x / y);
			DecimalFormat df = new DecimalFormat("0.###");
		    String fn = df.format(result);
		 
		 System.out.println(fn + " km/l");
	}
}
