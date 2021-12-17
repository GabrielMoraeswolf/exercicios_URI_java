package teste.java;

import java.util.Scanner;

public class uri1118 {

	public static void main(String[] args) {
		double nt,md = 0,mf;
		int d = 1,x,cont = 0,l = 0;
		while(d != 2){
			try(Scanner leitor = new Scanner(System.in)){
				nt = leitor.nextDouble();
				if (nt >= 0 && nt <= 10){
					cont ++;
					md += nt;
					if (cont == 2){
						mf = (md / 2);
						System.out.println("media = " + mf);
						cont = 0;
						md = 0;
						while(l != 1){	
							System.out.println("novo calculo (1-sim 2-nao)");
							x = leitor.nextInt();
							if (x == 1 || x == 2){
								d = x;
								l = 1;
							}							
						}
						nt = 0;				
					}			
				}
				else{
					System.out.println("nota invalida");
				}
			}
			l = 0;
		}

	}

}
