package p16_08_2022;

public class Auto {

	public String punoIme;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public int brzina;
//	Dopuna 1:
	public int ogranicenje;
//	Dopuna 2:
	public int godinaProizvodnje;
	public int mesecRegistracije;
	public int mesec;
	public int kubikaza;
	
	
	public void stampa() {
		System.out.println();
		System.out.println(this.punoIme);
		System.out.println(this.marka + " - " + this.brojVrata + " vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
		System.out.println(this.brzina + "km/h je trenutna brzina");
		System.out.println();
		if (prekoracenje() == true) {
			System.out.println("Prekoracili ste brzinu");
			System.out.println("Kazna je: " + kaznaMetoda() + " dinara");
		}
		System.out.println();
		if (this.godinaProizvodnje < 1950) {
			System.out.println("Auto je oldtimer");
		}
		else {
			System.out.println("Auto nije oldtimer");
		}
		System.out.println();
		if (registracijaMetoda() == true) {
			System.out.println("Auto je registovan");
		}
		else if (registracijaMetoda() == false) {
			System.out.println("Registracije je istekla");
		}
		System.out.println("Cena registracije je: " + cenaRegistracijeMetoda());
	}
	
	public boolean prekoracenje() {
		if (this.brzina > this.ogranicenje) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int kaznaMetoda () {
		if (prekoracenje() == true) {
			return ((this.brzina - this.ogranicenje) * 1000);
		
		}
		else {
			return 0;
		}
	}
	
	public boolean oldTajmerMetoda() {
		
		if (this.godinaProizvodnje < 1950) {
			boolean da = true;
			return da;
		}
		else {
			boolean da = false;
			return da;
		}

	}
	
	public boolean registracijaMetoda() {
		if (this.mesecRegistracije > this.mesec) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int cenaRegistracijeMetoda() {
		
		if (this.kubikaza < 2000) {
			int cena = (this.kubikaza * 100);
			return cena;
		}
		else {
			int cena = ((this.kubikaza * 100) + (this.kubikaza * 100 * 30 / 100));
			return cena;
		}
	}
}