package d06_09_2022;

public class Planina {

	private String imePlanine;
	private String imeDrzave;
	private double visinaPlanine;

	public Planina() {
		super();
	}

	public Planina(String imePlanine, String imeDrzave, double visinaPlanine) {
		super();
		this.imePlanine = imePlanine;
		this.imeDrzave = imeDrzave;
		this.visinaPlanine = visinaPlanine;
	}

	public String getImePlanine() {
		return imePlanine;
	}

	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}

	public String getImeDrzave() {
		return imeDrzave;
	}

	public void setImeDrzave(String imeDrzave) {
		this.imeDrzave = imeDrzave;
	}

	public double getVisinaPlanine() {
		return visinaPlanine;
	}

	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}

}
