package simpleFactory;

public class Autobuz extends MijlocTransport {

	public Autobuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public void afisareNrInmatriculare() {
		System.out.println("Autobuzul are numarul de inmatriculare: " + this.getNrInmatriculare());
	}

}
