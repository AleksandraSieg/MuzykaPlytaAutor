package obiekty;

public class Autor {
	String nazwisko;
	String imie;
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public Autor(String nazwisko, String imie) {
		super();
		this.nazwisko = nazwisko;
		this.imie = imie;
	}
}
