package proxy;

public class Autobuz implements MijlocTransport {
	int nrPasageri;
	int nrLinie;

	public Autobuz(int nrPasageri, int nrLinie) {
		super();
		this.nrPasageri = nrPasageri;
		this.nrLinie = nrLinie;
	}

	public void setNrPasageri(int nrPasageri) {
		this.nrPasageri = nrPasageri;
	}

	public void setNrLinie(int nrLinie) {
		this.nrLinie = nrLinie;
	}

	public int getNrPasageri() {
		return nrPasageri;
	}

	public int getNrLinie() {
		return nrLinie;
	}

	@Override
	public void oprireInStatie() {
		System.out.println(
				"Autobuzul de pe linia " + nrLinie + " a oprit in statie cu un numar de " + nrPasageri + " pasageri.");
	}

}
