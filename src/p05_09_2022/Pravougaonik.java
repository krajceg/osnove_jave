package p05_09_2022;

public class Pravougaonik extends Figura {
	
	protected int a;
	protected int b;
	
	public Pravougaonik(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public double povrsina() {
		return a * b;
	}

	@Override
	public double obim() {
		return 2 * a + 2 * b;
	}
	
	
}
