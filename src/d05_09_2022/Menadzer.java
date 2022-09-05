package d05_09_2022;

public class Menadzer extends Radnik {

	public Menadzer(String punoIme) {
		super(punoIme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double plataRadnik() {
		double zbirPlata = 0;
		for (int i = 0; i < nizSektora.size(); i++) {
			zbirPlata = zbirPlata + nizSektora.get(i).getPlata();
		}
		return zbirPlata;
	}

}
