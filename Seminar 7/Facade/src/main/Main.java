package main;

import facade.Autobuz;
import facade.FacadeAutobuz;

public class Main {
	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz();
		FacadeAutobuz.deschideUsi(autobuz);
		FacadeAutobuz.puneLiberUsi(autobuz);
	}

}
