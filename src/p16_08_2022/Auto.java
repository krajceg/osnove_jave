package p16_08_2022;

public class Auto {

	public String punoIme;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public int brzina;


	public int godinaProizvodnje;
	public int mesecRegistracije;
	public int kubikaza;

	public String brojRegistracije;
	public boolean klima;
	
	public int maxBrzina;
	public int kapacitetRezervoar;
	public int trenutnoURezervoaru;
	
	
	public void stampa() {
		System.out.println();
		System.out.println(this.punoIme);
		System.out.println(this.marka + " - " + this.brojVrata + " vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
		System.out.println(this.brzina + "km/h je trenutna brzina");
		System.out.println();
	}
	
	public boolean prekoracenje(int ogranicenje) {
		if (this.brzina > ogranicenje) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int kaznaMetoda (int k) {
		if (prekoracenje(k) == true) {
			return ((this.brzina - k) * 1000);
		
		}
		else {
			return 0;
		}
	}
	
	public boolean oldTajmerMetoda() {
		
		if (this.godinaProizvodnje < 1950) {
			return true;
		}
		else {
			return false;
		}

	}
	
	public boolean registracijaMetoda(int mesec) {
		if (this.mesecRegistracije > mesec) {
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

	public void dodajGas() {
		this.brzina = this.brzina + 10;
		if (this.brzina > this.maxBrzina) {
			this.brzina = this.maxBrzina;
		}
	}
	
	public void smanjiGas() {
		this.brzina = this.brzina -10;
		if (this.brzina < 0) {
			this.brzina = 0;
		}
	}

	public double potrosnjaMetoda () {
		double faktor = 1;
		if (klima == true) {
			faktor = 1.2;
		}
		return (this.brzina / 100.0 * potrosnja) * faktor;
	}

	public void stampajTablu () {
		int brojJedinica = this.brzina * 100 / this.maxBrzina;
		
		for (int i = 0; i < 100; i++) {
			if (i < brojJedinica) {
				System.out.print("|");
			}
			else {
				System.out.print(".");
			}
		}
		System.out.println(this.brzina + "/" + this.maxBrzina + "km/h");
	}

	public double nataci (int litri) {
		if (litri + this.trenutnoURezervoaru > this.kapacitetRezervoar) {
			return (this.kapacitetRezervoar - this.trenutnoURezervoaru) * 100;
		}
		else {
			return litri * 100;
		}
	}

}