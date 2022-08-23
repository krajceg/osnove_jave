package d19_08_2022;

import java.util.Scanner;

public class Vezba1_Skocko {
	static Scanner s = new Scanner(System.in);
	
	public static String polje1;
	public static String polje2;
	public static String polje3;
	public static String polje4;
	
	public static void igraj() {
		
		
		System.out.print("Unesite polje 1: ");
		polje1 = s.next();

		System.out.print("Unesite polje 2: ");
		polje2 = s.next();

		System.out.print("Unesite polje 3: ");
		polje3 = s.next();

		System.out.print("Unesite polje 4: ");
		polje4 = s.next();
	}
	
	public static void main(String[] args) {

		SkockoGame skocko = new SkockoGame();
		String opet;

		do {
			skocko.novaIgra();
			skocko.stampaTrazenu();

			do {
				igraj();
				skocko.odigrajKombinaciju(polje1, polje2, polje3, polje4);
				skocko.stampaOdigranu();
				
				System.out.println(" - " + skocko.brojPogodakaNaMestu() + " na mestu, "
						+ skocko.brojPogodakaAliNisuNaMestu() + " pogodjena ali nisu na mestu");
				System.out.println();

				if (skocko.isWinner() == true) {
					skocko.stampaTrazenu();
					System.out.println("Cestitamo! Pobedili ste!");
					break;
				}
				if (skocko.isGameOver() == true) {
					System.out.println("Kraj igre!");
					break;
				}

			} 
			while (skocko.isWinner() == false || skocko.isGameOver() == false);
			
			System.out.println();
			System.out.print("Da li zelite da igrate opet? ");
			opet = s.next();
		} 
		while (opet.equals("da"));
		
		if (!opet.equals("da")) {
			System.out.println();
			System.out.println("KRAJ PROGRAMA!!!");
		}
	}
	
}
