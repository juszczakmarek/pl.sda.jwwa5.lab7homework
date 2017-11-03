package pl.sda.wwa5.homework.importedExamples.examples;

import java.util.ArrayList;
import java.util.List;

interface OczekujacyPrzesylki {
	void nowaPrzesylka();
}

class Paczkomat {
	private List<OczekujacyPrzesylki> klienciPaczkomatu = new ArrayList<OczekujacyPrzesylki>();
	
	public void dodajOczekujacego(OczekujacyPrzesylki klient) {
		klienciPaczkomatu.add(klient);
	}
	
	public void poinformujONowychPrzesylkach() {
		System.out.println("Rozsy�am informacj� o nowych przesy�kach.");
		
		for(OczekujacyPrzesylki klient : klienciPaczkomatu) {
			klient.nowaPrzesylka();
		}
	}
}

class KlientPaczkomatu implements OczekujacyPrzesylki {
	@Override
	public void nowaPrzesylka() {
		System.out.println("Super, moja paczka ju� dotar�a!");
	}
}

public class ObserverDesignPattern {
	public static void main(String[] args) {
		Paczkomat waw35 = new Paczkomat();
		KlientPaczkomatu przemek = new KlientPaczkomatu();
		
		waw35.dodajOczekujacego(przemek);
		
		waw35.poinformujONowychPrzesylkach();
	}
}
