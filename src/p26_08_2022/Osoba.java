package p26_08_2022;

public class Osoba {
	
	protected String punoIme;
	protected String jmbg;
	
	public Osoba(String punoIme, String jmbg) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
	}
	
	public void stampaj() {
		System.out.println("Ime: " + this.punoIme);
		System.out.println("JMBG: " + this.jmbg);
	}

}
