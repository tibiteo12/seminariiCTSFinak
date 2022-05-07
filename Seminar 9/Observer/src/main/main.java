package main;

import observer.Autobuz;
import observer.Calator;

public class main {

	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("'Autobuzul a plecat din statie'");
		
		Calator calator1 = new Calator("Ion Popescu");
		Calator calator2 = new Calator("Maria Ionescu");
		Calator calator3 = new Calator("Andrei Marinescu");
		Calator calator4 = new Calator("Liam Mesrefoglu");
		
		autobuz.adaugaObserver(calator1);
		autobuz.adaugaObserver(calator2);
		autobuz.adaugaObserver(calator3);
		
		autobuz.anuntaCalator();

		autobuz.eliminaObserver(calator2);
		autobuz.eliminaObserver(calator3);
		autobuz.adaugaObserver(calator4);
		System.out.println("\n");
		autobuz.anuntaCalator();
	}

}
