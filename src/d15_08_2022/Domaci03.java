package d15_08_2022;

public class Domaci03 {

	public static void main(String[] args) {

//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu 
//		vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

		int a = 2;
		int b = 3;
		int c = noviAB(a, b);
		System.out.println(c);

	}

	public static int noviAB(int a, int b) {

		String aBroj = "" + a;
		String bBroj = "" + b;
		int c = Integer.valueOf(aBroj + bBroj);
		return c;
	}

}
