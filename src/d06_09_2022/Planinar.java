package d06_09_2022;

public abstract class Planinar {
	
	protected int jcib;
	protected String punoIme;
	
	public Planinar(int jcib, String punoIme) {
		super();
		this.jcib = jcib;
		this.punoIme = punoIme;
	}

	public int getJcib() {
		return jcib;
	}

	public String getPunoIme() {
		return punoIme;
	}
	
	public abstract double clanarina();
	
	public abstract boolean uspesanUspon (Planina planina);
	
	public abstract void stampaj();
}	
