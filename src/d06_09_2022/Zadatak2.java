package d06_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		PlaninarskiDom dom = new PlaninarskiDom ("Planinarski dom Zarko Zaric", 1980);
		
		Alpinista sveta = new Alpinista(11111, "Svetolik Kljajic", 10);
		Alpinista pera = new Alpinista(22222, "Pera Peric", 5);
		Alpinista mika = new Alpinista(33333, "Mika Mikic", 0);
		
		RekreativniPlaninar zika = new RekreativniPlaninar(666666, "Zika Zikic", 0, "Krusevacki", 2000);
		RekreativniPlaninar aca = new RekreativniPlaninar(777777, "Aleksandar Katic", 10, "Niski", 2500);
		RekreativniPlaninar nenad = new RekreativniPlaninar(888888, "Nenad Misic", 20, "Beogradski", 3000);
		
		Planina kopaonik = new Planina("Kopaonik", "Srbija", 2300);
		
		dom.uclaniPlaninara(sveta);
		dom.uclaniPlaninara(pera);
		dom.uclaniPlaninara(mika);
		dom.uclaniPlaninara(zika);
		dom.uclaniPlaninara(aca);
		dom.uclaniPlaninara(nenad);
		
		System.out.println("Sveta clanarina: " + sveta.clanarina());
		System.out.println("Pera clanarina: " + pera.clanarina());
		System.out.println("Nenad clanarina: " + nenad.clanarina());
		System.out.println();
		
		dom.stampaj();
		System.out.println("Broj uspesnih planinara na Kopaoniku: " + dom.brojUspenihPlaninara(kopaonik));
		dom.izbaciPlaninara(11111);
		dom.stampaj();
		
		

	}

}
