package p22_08_2022;

public class Kupac {
	
	private String punoIme;
	private ClanskaKarta clanskaKarta;
	
	public Kupac(String punoIme, ClanskaKarta clanskaKarta) {
		this.punoIme = punoIme;
		this.clanskaKarta = clanskaKarta;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta;
	}
	
	public void stampaj() {
		System.out.println(this.punoIme + " - " + clanskaKarta.getBrojKartice());
	}
}
	
