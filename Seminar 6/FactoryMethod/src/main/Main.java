package main;

import factoryMethod.MijlocTransport;
import familyFactory.FabricaAutobuz;
import familyFactory.FabricaTramvai;
import familyFactory.FabricaTroleibuz;

public class Main {
	public static void main(String[] args) {
		MijlocTransport autobuz = new FabricaAutobuz().getMijlocTransport("AU59");
		MijlocTransport tramvai = new FabricaTramvai().getMijlocTransport("TR09");
		MijlocTransport troleibuz = new FabricaTroleibuz().getMijlocTransport("TRO58");

		autobuz.afisareNrInmatriculare();
		tramvai.afisareNrInmatriculare();
		troleibuz.afisareNrInmatriculare();
	}
}
