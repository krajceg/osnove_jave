package p05_09_2022;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
		super(suma, brojKartice, godina, mesec);
		// TODO Auto-generated constructor stub
	}
	
	public void naplatiOdrzavanje() {
		this.suma = this.suma - 2;
	}
	
	@Override
	public void izvrsiTransakciju(double unetaVrednost) {
		double provizija = unetaVrednost * 1.5 / 100;
		this.suma = this.suma - (unetaVrednost + provizija);
		
	}

	@Override
	public void stampaj() {
		System.out.println("Master Card: " + this.mesec + "/" + this.godina + ", " + this.brojKartice + ", $" + this.suma);
		
	}
	
	
}
