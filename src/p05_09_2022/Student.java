package p05_09_2022;

public abstract class Student {
	
	protected String punoIme;
	protected String brojIndexa;
	protected int godinaStudija;
	
	public Student(String punoIme, String brojIndexa, int godinaStudija) {
		super();
		this.punoIme = punoIme;
		this.brojIndexa = brojIndexa;
		this.godinaStudija = godinaStudija;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
	public abstract int skolarina();
	
	public abstract boolean daLiJeNaBudzetu();
	
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.brojIndexa + ", " + this.godinaStudija);
		System.out.print("Finansiranje: ");
		if (daLiJeNaBudzetu() == true) {
			System.out.println("budzet");
		}
		else {
			System.out.println("samofinansirajuci");
		}
		System.out.println("Cena skolarine: " + this.skolarina());
	}

}
