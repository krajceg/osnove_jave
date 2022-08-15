package d15_08_2022;

public class Domaci01 {
	
	public static void main(String[] args) {
		
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		
		int a = 10;
		int b = stampajVrednostZa10Vecu(a);
		System.out.println(b);
		
	}

	public static int stampajVrednostZa10Vecu(int a) {
		
		a = a + 10;
		return a;
	}
	
	
}
