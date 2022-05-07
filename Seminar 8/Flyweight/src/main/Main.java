package main;

import main.flyweight.Autobuz;
import main.flyweight.LinieFactory;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz1 = new Autobuz("Mercedes", 2000, 30);
		Autobuz autobuz2 = new Autobuz("Fiat", 2009, 50);
		Autobuz autobuz3 = new Autobuz("Mercedes", 2009, 100);
		Autobuz autobuz4 = new Autobuz("Fiat", 2002, 10);
		
		LinieFactory factory = new LinieFactory();
		factory.getLinie(137).descriereAutobuz(autobuz1);
		factory.getLinie(137).descriereAutobuz(autobuz2);
		factory.getLinie(381).descriereAutobuz(autobuz3);
		factory.getLinie(168).descriereAutobuz(autobuz4);

	}

}
