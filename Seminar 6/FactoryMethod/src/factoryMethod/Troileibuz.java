package factoryMethod;

public class Troileibuz extends MijlocTransport {

	public Troileibuz(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public void afisareNrInmatriculare() {
		System.out.println("Troleibuzul are numarul de inmatriculare: " + this.getNrInmatriculare());
	}

}
