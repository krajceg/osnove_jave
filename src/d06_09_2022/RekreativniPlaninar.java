package d06_09_2022;

public class RekreativniPlaninar extends Planinar {
	
	protected int tezinaOpreme;
	protected String nazivOkruga;
	protected int maxUsponBezOpreme;
	
	public RekreativniPlaninar(int jcib, String punoIme, int tezinaOpreme, String nazivOkruga, int maxUsponBezOpreme) {
		super(jcib, punoIme);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}

	@Override
	public double clanarina() {
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (maxUsponBezOpreme + (50 * tezinaOpreme) < planina.getVisinaPlanine()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void stampaj() {
		System.out.println("Rekreativac, ID: (" + this.jcib + ")");
		System.out.println("Ime: (" + this.punoIme + ")");
		System.out.println("Okrug: (" + this.nazivOkruga + ")");
		System.out.println();
	}

}
