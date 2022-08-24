package d23_08_2022;

public class Racun {

	private String brojRacuna;
	private String punoIme;
	private double stanjeRacun;
	
	public Racun(String brojRacuna, String punoIme, double stanjeRacun) {
		this.brojRacuna = brojRacuna;
		this.punoIme = punoIme;
		this.stanjeRacun = stanjeRacun;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public double getStanjeRacun() {
		return stanjeRacun;
	}
	
	public void menjaStanje (double trazenaSuma) {
			this.stanjeRacun = this.stanjeRacun + trazenaSuma;
	}
	
	public void stampaj () {
		System.out.println(this.punoIme + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je " + this.stanjeRacun + " rsd.");
		System.out.println();
	}
	
}
