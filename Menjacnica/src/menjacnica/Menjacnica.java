package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String nazivValute, Kurs kurs) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNazivValute().equals(nazivValute)) {
				valute.get(i).getKursevi().add(kurs);
			}
		}
	}

	@Override
	public void obrisiKurs(String nazivValute, Kurs kurs) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNazivValute().equals(nazivValute)) {
				valute.get(i).getKursevi().remove(kurs);
			}
		}

	}

	@Override
	public Kurs vratiKurs(String nazivValute, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {

			if (valute.get(i).getNazivValute().equals(nazivValute)) {

				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if (valute.get(i).getKursevi().get(j).getDatum().equals(datum)) {
						return valute.get(i).getKursevi().get(j);
					}
				}
			}
		}
		return null;
	}
}