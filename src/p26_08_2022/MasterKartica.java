package p26_08_2022;

public class MasterKartica extends PlatnaKartica {
	
	public MasterKartica (int suma, String brojKartice, int godina, int mesec) {
		super(suma, brojKartice, godina, mesec);
	}
	
	@Override
	public void izvrsiTransakciju(double skida) {
		double provizija = (skida*1.5)/100;
		skida = skida + provizija;
		super.izvrsiTransakciju(skida);
	}
	
	public void naplatiOdrzavanje () {
		this.suma = this.suma - 2;
	}
	
	@Override
	public void stampaj() {
		System.out.print("Master Card: ");
		super.stampaj();
	}
}
