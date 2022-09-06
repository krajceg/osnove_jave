package p06_09_2022;

public class Skakac extends Atleticar {

	public Skakac(String punoIme, int rezultat) {
		super(punoIme, rezultat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean daLiJeRezultatBolji(Atleticar atleticar) {
		if (this.getRezultat() > atleticar.getRezultat()) {
			return true;
		}
		return false;
	}
	

}
