package teste.java;

import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) {
		int n = 0,i,g,empate = 0,ci = 0,cg = 0,tt = 0;
		try(Scanner leitor = new Scanner(System.in)){
			while(n != 2){
				i = leitor.nextInt();
				g = leitor.nextInt();
				if (i == g){
					empate++;
				}
				else if (i > g){
					ci++;
				}
				else if (i < g){
					cg++;
				}
				System.out.println("Novo grenal (1-sim 2-nao)");
				n = leitor.nextInt();
				tt++;
			}
		}	
		System.out.println(tt+" grenais");
		System.out.println("Inter:"+ci);
		System.out.println("Gremio:"+cg);
		System.out.println("Empates:"+empate);
		if (ci > cg){
			System.out.println("Inter venceu mais");
		}
		else if (ci < cg){
			System.out.println("Gremio venceu mais");
		}
		else{
			System.out.println("Nao houve vencedor");
		}
	}

}
