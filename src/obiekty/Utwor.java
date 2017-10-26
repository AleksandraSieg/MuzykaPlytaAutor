package obiekty;

public class Utwor {
	String tytul;
	int dlugoscWSekundach;
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public int getDlugoscWSekundach() {
		return dlugoscWSekundach;
	}
	public void setDlugoscWSekundach(int dlugoscWSekundach) {
		this.dlugoscWSekundach = dlugoscWSekundach;
	}
	public Utwor(String tytul, int dlugoscWSekundach) {
		super();
		this.tytul = tytul;
		this.dlugoscWSekundach = dlugoscWSekundach;
	}
}
