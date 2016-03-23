package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String nazivValute;
	private String skraceniNazivValute;
	
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}

	public String getNazivValute() {
		return nazivValute;
	}

	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}

	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}

	public void setSkraceniNazivValute(String skraceniNazivValute) {
		this.skraceniNazivValute = skraceniNazivValute;
	}

}
