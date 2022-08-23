package p22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Film film = new Film ();
		Reziser reziser = new Reziser ();
		
		reziser.reziser("Lana Wachowski", 57);
		film.film("Matrix", 1999, reziser);
		
		film.print();
		reziser.printReziser();
		
		
	}

}
