package main;

import proxy.AutobuzDeNoapte;
import proxy.MijlocTransport;
import proxy.Autobuz;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz(5, 381);
		AutobuzDeNoapte autobuzNoapte = new AutobuzDeNoapte(autobuz);
		autobuz.oprireInStatie();
		
		autobuz.setNrPasageri(0);
		autobuzNoapte.oprireInStatie();
	}

}
