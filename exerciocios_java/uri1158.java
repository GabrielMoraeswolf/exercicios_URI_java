package teste.java;

import java.util.Scanner;

public class uri1158 {

	public static void main(String[] args) {
			int n,x,y,j = 0,result;
			try(Scanner leitor =  new Scanner(System.in)){
				n = leitor.nextInt();
			for (int i = 0; i < n; ++i){
				x = leitor.nextInt();
				y = leitor.nextInt();
				result = 0;
				while(j < y){
					if (x % 2 != 0){
						result += x;
						j++;
					}
					x++;
				}
				j = 0;
				System.out.println(result);
			}
		}
	}
}
