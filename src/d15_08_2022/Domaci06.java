package d15_08_2022;

public class Domaci06 {

	public static void main(String[] args) {

//		Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//		Primer izvrsenja: 
//		izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//		izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//		Napomena: Resiti bez koriscenja petlji. 

		int n = -5;
		int m = 1;

		int c = celiBrojevi(n, m);
		System.out.println("izbroji(" + n + ", " + m + ") ima za rezultat " + c);

	}

	public static int celiBrojevi(int n, int m) {

		int c = Math.abs(m - n) - 1;
		return c;
	}

}
