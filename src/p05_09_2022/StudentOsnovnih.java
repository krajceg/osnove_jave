package p05_09_2022;

public class StudentOsnovnih extends Student {

	public StudentOsnovnih(String punoIme, String brojIndexa, int godinaStudija) {
		super(punoIme, brojIndexa, godinaStudija);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int skolarina() {
		return 90000;
	}

	@Override
	public boolean daLiJeNaBudzetu() {
		return godinaStudija < 5;
	}

}
