package teste.java;

public class uri1155 {

	public static void main(String[] args) {
		double s = 0;
		for (int i = 1; i <= 100; ++i){
			s += (1.0 / i);
		}
		System.out.println(String.format("%.2f", s));
	}

}
