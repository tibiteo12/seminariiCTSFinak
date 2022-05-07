package main;

import factory.Fabrica;
import simpleFactory.MijlocTransport;
import simpleFactory.TipTransport;

public class Main {
	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		MijlocTransport autobuz = fabrica.getMijlocTransport(TipTransport.Autobuz, "AU20");
		MijlocTransport tramvai = fabrica.getMijlocTransport(TipTransport.Tramvai, "TR90");
		MijlocTransport troleibuz = fabrica.getMijlocTransport(TipTransport.Troileibuz, "TRO43");

		autobuz.afisareNrInmatriculare();
		tramvai.afisareNrInmatriculare();
		troleibuz.afisareNrInmatriculare();
	}
}
