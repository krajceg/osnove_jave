package d15_08_2022;

public class Domaci04 {

	public static void main(String[] args) {

//		Napisati metodu koja stampa podatke o korisniku u formatu:
//			JMBG: [jmbg]
//			Ime: [ime]
//			Prezime: [prezime]
//			God. rodjenja: [god]
//			Aktivan: [true/false]
//			Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//			Metoda nista ne vraca.

		podaci("12121212", "Svetolik", "Kljajic", 1988, true);

	}

	public static void podaci(String jmbg, String ime, String prezime, int god, boolean aktivan) {

		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + god);
		System.out.println("Aktivan: " + aktivan);
	}

}
