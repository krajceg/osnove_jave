package p05_09_2022;

public class StudentMaster extends Student {

	public StudentMaster(String punoIme, String brojIndexa, int godinaStudija) {
		super(punoIme, brojIndexa, godinaStudija);
	}

	@Override
	public int skolarina() {
		return 100000;
	}

	@Override
	public boolean daLiJeNaBudzetu() {
		return godinaStudija < 2;
	}

}
