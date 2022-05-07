package facade;

public class FacadeAutobuz {
	public static void deschideUsi(Autobuz autobuz) {
		autobuz.deschideUsaFata();
		autobuz.deschideUsaSpate();
		autobuz.deschideUsaMijloc();
	}

	public static void puneLiberUsi(Autobuz autobuz) {
		autobuz.puneLiberUsaFata();
		autobuz.puneLiberUsaSpate();
		autobuz.puneLiberUsaMijloc();
	}
}
