package p16_08_2022;

public class Racun {

	public String ime;
	public String prezime;
	public String racun;
	public int stanje;
	
	
	public void stampa() {
		System.out.println("Posaljilac: " + this.ime + " " + this.prezime + ", " + this.racun + 
							", stanje: " + stanje);
		System.out.println();
	}
	
	public void stampa2() {
		System.out.println("Primalac: " + this.ime + " " + this.prezime + ", " + this.racun + 
							", stanje: " + this.stanje);
		System.out.println();
	}
	
	}

