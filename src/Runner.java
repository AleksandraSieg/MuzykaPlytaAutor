import obiekty.Plyta;
import obiekty.Utwor;
import narzedzia.Utils;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plyta plyta = Utils.createPlyta(Utils.createAutor("Valo", "Ville"), Utils.createList(new Utwor []{
			Utils.createUtwor("Join me", 190),
			Utils.createUtwor("Summer wine", 210),
			Utils.createUtwor("Bittersweet", 197)
		}));
		
		Utils.pokazZawartoscPlyty(plyta);
		
		Utils.szukajNajdluzszyUtwor(plyta);
	}

}
