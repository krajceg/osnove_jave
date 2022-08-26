package d23_08_2022;

public class ElektricniSporet {

	private String markaSporeta;
	private int garancijaGod;
	private int maxRingli; // Maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3 ili 4)
	private Ringla RinglaGoreLevo;
	private Ringla RinglaGoreDesno;
	private Ringla RinglaDoleLevo;
	private Ringla RinglaDoleDesno;

	public ElektricniSporet(String markaSporeta, int garancijaGod, int maxRingli, Ringla ringlaGoreLevo,
			Ringla ringlaGoreDesno, Ringla ringlaDoleLevo, Ringla ringlaDoleDesno) {
		this.markaSporeta = markaSporeta;
		this.garancijaGod = garancijaGod;
		this.maxRingli = maxRingli;
		RinglaGoreLevo = ringlaGoreLevo;
		RinglaGoreDesno = ringlaGoreDesno;
		RinglaDoleLevo = ringlaDoleLevo;
		RinglaDoleDesno = ringlaDoleDesno;
	}

	public String getMarkaSporeta() {
		return markaSporeta;
	}

	public int getGarancijaGod() {
		return garancijaGod;
	}

	public int getMaxRingli() {
		return maxRingli;
	}

	public Ringla getRinglaGoreLevo() {
		return RinglaGoreLevo;
	}

	public Ringla getRinglaGoreDesno() {
		return RinglaGoreDesno;
	}

	public Ringla getRinglaDoleLevo() {
		return RinglaDoleLevo;
	}

	public Ringla getRinglaDoleDesno() {
		return RinglaDoleDesno;
	}

	public void pojacaj(String pozicija) {
		int brojUpaljenih = 0;

		if (pozicija.equals("pozicija 1")) {
			this.RinglaGoreLevo.pojacaj();
		}
		if (pozicija.equals("pozicija 2")) {
			this.RinglaGoreDesno.pojacaj();
		}
		if (pozicija.equals("pozicija 3")) {
			this.RinglaDoleLevo.pojacaj();
		}
		if (pozicija.equals("pozicija 4")) {
			this.RinglaDoleDesno.pojacaj();
		}

		if (this.RinglaGoreLevo.radi() == true) {
			brojUpaljenih++;
		}
		if (this.RinglaGoreDesno.radi() == true) {
			brojUpaljenih++;
		}
		if (this.RinglaDoleLevo.radi() == true) {
			brojUpaljenih++;
		}
		if (this.RinglaDoleDesno.radi() == true) {
			brojUpaljenih++;
		}

		if (brojUpaljenih > maxRingli) {
			if (!pozicija.equals("pozicija 1")) {
				iskljuci("pozicija 1");
			}
			if (!pozicija.equals("pozicija 2")) {
				iskljuci("pozicija 2");
			}
			if (!pozicija.equals("pozicija 3")) {
				iskljuci("pozicija 3");
			}
			if (!pozicija.equals("pozicija 4")) {
				iskljuci("pozicija 4");
			}
		}
	}
	
	public void iskljuci (String pozicija) {
		
		if (pozicija.equals("pozicija 1")) {
			this.RinglaGoreLevo.iskljuci();
		}
		if (pozicija.equals("pozicija 2")) {
			this.RinglaGoreDesno.iskljuci();
		}
		if (pozicija.equals("pozicija 3")) {
			this.RinglaDoleLevo.iskljuci();
		}
		if (pozicija.equals("pozicija 4")) {
			this.RinglaDoleDesno.iskljuci();
		}
	}
	
	public double potrosnjaSporeta (double vreme1, double vreme2, double vreme3, double vreme4) {
		return (this.RinglaGoreLevo.potrosnja(vreme1) + this.RinglaGoreDesno.potrosnja(vreme2) +
				this.RinglaDoleLevo.potrosnja(vreme3) + this.RinglaDoleDesno.potrosnja(vreme4));
	}
	
	public void stampaj () {
		System.out.println("Marka: " + this.markaSporeta + " - " + this.garancijaGod + " godina garancije");
		System.out.println("Ringle:");
		System.out.println();
		System.out.println("Gore levo:");
		this.RinglaGoreLevo.stampaj();
		System.out.println("Gore desno:");
		this.RinglaGoreDesno.stampaj();
		System.out.println("Dole levo:");
		this.RinglaDoleLevo.stampaj();
		System.out.println("Dole desno");
		this.RinglaDoleDesno.stampaj();
	}
}
