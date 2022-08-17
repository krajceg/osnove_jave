package d16_08_2022;

public class Vezba01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int x = suma(10,a);
		x = suma(x, b);
		x = suma(x, c);
		System.out.println(x);

	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
}
