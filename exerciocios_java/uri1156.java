package teste.java;

public class uri1156 {

	public static void main(String[] args) {
		double s = 1.0,j = 1;
		for (int i = 3; i <= 39; i+=2) {
			j *= 2;
			s += (i/j);
		}
		System.out.println(String.format("%.2f", s));
		
	}

}
