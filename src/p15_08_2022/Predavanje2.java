package p15_08_2022;

public class Predavanje2 {

	public static void main(String[] args) {
		
		int z = sumiraj(10, 20);
		double z2 = multiply(10, 20);
	}
//	Void => nema povratnu vrednost
//	int
//	dobule
//	STring
//	char
//	ArrayList<>
	
	
	public static int sumiraj(int a, int b) {
		
		int zbir = a + b;
		return zbir;
	}
	public static double multiply (double a, double b) {
		return a * b;
	}
	
}
