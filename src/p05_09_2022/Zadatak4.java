package p05_09_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		
		VideoPlayer player = new VideoPlayer(300, 30, 10, 144);
		
		player.stampaj();
		
		QualityOptimizerControl k = new QualityOptimizerControl(500);
		AudioControl a = new AudioControl(true);
		TimeControl t = new TimeControl(true);
		
		a.izvrsiAkciju(player);
		a.izvrsiAkciju(player);
		t.izvrsiAkciju(player);
		k.izvrsiAkciju(player);
		
		player.stampaj();

	}

}
