package obiekty;

import java.util.List;

public class Plyta {
	Autor autor;
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public List<Utwor> getListaUtworow() {
		return listaUtworow;
	}
	public void setListaUtworow(List<Utwor> listaUtworow) {
		this.listaUtworow = listaUtworow;
	}
	List<Utwor> listaUtworow;
	public Plyta(Autor autor, List<Utwor> listaUtworow) {
		super();
		this.autor = autor;
		this.listaUtworow = listaUtworow;
	}
	
}
