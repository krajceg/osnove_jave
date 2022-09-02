package mini_projekat;

public class Player {
	
	private String punoIme;

	public Player(String punoIme) {
		super();
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public void stampaj() {
		System.out.println(this.punoIme);
	}

}
