package narzedzia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import obiekty.Autor;
import obiekty.Plyta;
import obiekty.Utwor;

public class Utils {
	
	public static Plyta createPlyta(Autor autor, List<Utwor> listaUtworow){
		return new Plyta(autor, listaUtworow);
	}
	
	public static Autor createAutor(String nazwisko, String imie){
		return new Autor(nazwisko, imie);
	}
	
	public static Utwor createUtwor(String tytul, int dlugoscWSekudnach){
		Utwor utwor = new Utwor(tytul, dlugoscWSekudnach);
		return utwor;
	}
	
//	public static List<Utwor> createList(Utwor...utwors){
//		return Arrays.asList(utwors);
//	}
	
	public static List<Utwor> createList(Utwor...utwors){
		List<Utwor> list = new ArrayList<>();
		for(int i = 0; i<utwors.length; i++){
			list.add(utwors[i]);
		}
		return list;
	}
	
	public static void pokazZawartoscPlyty(Plyta plyta){
		System.out.println("imie i nazwisko artysty: " + plyta.getAutor().getImie() + " " + plyta.getAutor().getNazwisko());
		System.out.println("Lista utworow i ich dlugosc");
		for(Utwor utwor : plyta.getListaUtworow()){
			System.out.println(utwor.getTytul()+" "+utwor.getDlugoscWSekundach());
		}
	}
	
	public static void szukajNajdluzszyUtwor(Plyta plyta){
		
//		int liczbaPomocnicz = plyta.getListaUtworow().get(0).getDlugoscWSekundach();
//		String nazwa = "";
		Utwor utworPomocniczy = plyta.getListaUtworow().get(0);
		
//		for(Utwor i : plyta.getListaUtworow()){
//			if(liczbaPomocnicz<i.getDlugoscWSekundach()){
//				nazwa = i.getTytul();
//				liczbaPomocnicz = i.getDlugoscWSekundach();
//			}
//		}
		
		for(Utwor i : plyta.getListaUtworow()){
			if(utworPomocniczy.getDlugoscWSekundach()<i.getDlugoscWSekundach()){
				utworPomocniczy = i;
			}
		}
		
		System.out.println(utworPomocniczy.getTytul()+ " "+utworPomocniczy.getDlugoscWSekundach());
		
		
//		System.out.println("Najdluzszy utwor to: " + nazwa);
	}
}
