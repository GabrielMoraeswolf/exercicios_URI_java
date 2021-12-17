package teste.java;

import java.util.Scanner;

public class uri1070 {
	public static void main(String[] args) {
		int y,x,con = 0;
		try(Scanner leitor = new Scanner(System.in)) {
			x = leitor.nextInt();
		}	
		if (x % 2 == 0) {
			y = x+1;
			while (con < 6) {
				if (y % 2 != 0) {
					System.out.println(y);
					con++;
				}
				y++;
			}	
		}
		else {
			y = x;
			while (con < 6) {
				if (y % 2 != 0) {
					System.out.println(y);
					con++;
				}
				y++;
			}
		}				
	}
}
