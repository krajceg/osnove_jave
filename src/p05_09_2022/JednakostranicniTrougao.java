package p05_09_2022;

public class JednakostranicniTrougao extends Figura {
	
	protected int a;

	public JednakostranicniTrougao(int stranicaA) {
		super();
		this.a = stranicaA;
	}

	public int getStranicaA() {
		return a;
	}

	public void setStranicaA(int stranicaA) {
		this.a = stranicaA;
	}

	@Override
	public double povrsina() {
		return (a * a) * 1.73205 / 4;
	}

	@Override
	public double obim() {
		return 3 * a;
	}
	
	
}
