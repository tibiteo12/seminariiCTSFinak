package factoryMethod;

public class Tramvai extends MijlocTransport {

	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public void afisareNrInmatriculare() {
		System.out.println("Tramvaiul are numarul de inmatriculare: " + this.getNrInmatriculare());
	}

}
