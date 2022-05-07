package proxy;

public class AutobuzDeNoapte implements MijlocTransport {
	Autobuz autobuz;

	public AutobuzDeNoapte(Autobuz autobuz) {
		super();
		this.autobuz = autobuz;
	}

	@Override
	public void oprireInStatie() {
		if (autobuz.getNrPasageri() > 0) {
			autobuz.oprireInStatie();
		} else {
			System.out.println("Autobuzul se retrage in autobaza!");
		}

	}

}
