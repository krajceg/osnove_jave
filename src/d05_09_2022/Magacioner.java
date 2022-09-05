package d05_09_2022;

public class Magacioner extends Radnik 	{
	
	public Magacioner(String punoIme) {
		super(punoIme);
		// TODO Auto-generated constructor stub
	}

	private double prosecnaPlata() {
		double racunica = 0;
		for (int i = 0; i < nizSektora.size(); i++) {
			racunica = racunica + nizSektora.get(i).getPlata();
		}
		racunica = racunica / nizSektora.size() * 0.5;
		return racunica;
	}
	
	@Override
	public double plataRadnik() {
		return prosecnaPlata() * nizSektora.size();
	}
	
	
}
