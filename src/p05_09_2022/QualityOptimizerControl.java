package p05_09_2022;

public class QualityOptimizerControl extends Control {
	
	protected double brzinaNeta;

	public QualityOptimizerControl(double brzinaNeta) {
		super();
		this.brzinaNeta = brzinaNeta;
	}

	public double getBrzinaNeta() {
		return brzinaNeta;
	}

	public void setBrzinaNeta(double brzinaNeta) {
		this.brzinaNeta = brzinaNeta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (this.brzinaNeta * 10.1 <= 144) {
			player.kvalitetVidea = 144;
		}
		else if (this.brzinaNeta * 10.1 <= 240) {
			player.kvalitetVidea = 240;
		}
		else if (this.brzinaNeta * 10.1 <= 360) {
			player.kvalitetVidea = 360;
		}
		else if (this.brzinaNeta * 10.1 <= 480) {
			player.kvalitetVidea = 480;
		}
		else if (this.brzinaNeta * 10.1 <= 720) {
			player.kvalitetVidea = 720;
		}
		else {
			player.kvalitetVidea = 1080;
		}
		
	}
	
	
}
