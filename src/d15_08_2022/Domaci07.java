package d15_08_2022;

public class Domaci07 {

	public static void main(String[] args) {

//		Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. 
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

		int a = 11;
		int b = 51;
		int c = 9;

		System.out.println("Najmanju vrednost ima broj: " + najmanjiBroj(a, b, c));

	}

	public static int najmanjiBroj(int a, int b, int c) {

		int najmanjiBr;
		if (a < b && a < c) {
			najmanjiBr = a;
		}
		else if ( b < a && b < c) {
			najmanjiBr = b;
		}
		else {
			najmanjiBr = c;
		}
		return najmanjiBr;
	}

}
