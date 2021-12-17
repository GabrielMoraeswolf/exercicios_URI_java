package teste.java;

import java.util.Scanner;

public class uri1094 {

	public static void main(String[] args) {
		int n,x,c = 0,r = 0,s = 0,total = 0;
		char tipo;
		try(Scanner leitor = new Scanner(System.in)){
			n = leitor.nextInt();
			for (int i = 0; i < n; i++) {
				x = leitor.nextInt();
				tipo = leitor.next().charAt(0);
				switch(tipo) {
					case 'C':
						c += x;
						break;
					case 'R':
						r += x;
						break;
					case 'S':
						s += x;
						break;
				}
				total += x;
			}
		}
		double pc = (((double)c/total)*100);
		double pr = (((double)r/total)*100);
		double ps = (((double)s/total)*100);
		System.out.println("Total: "+total+" cobaias");
		System.out.println("Total de coelhos: "+c);
		System.out.println("Total de ratos: "+r);
		System.out.println("Total de sapos: "+s);
		System.out.println("Percentual de coelhos: "+String.format("%.2f",(pc))+" %");
		System.out.println("Percentual de ratos: "+String.format("%.2f",(pr))+" %");
		System.out.println("Percentual de sapos: "+String.format("%.2f",(ps))+" %");
	}

}
