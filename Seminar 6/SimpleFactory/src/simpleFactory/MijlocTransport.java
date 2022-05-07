package simpleFactory;

public abstract class MijlocTransport {
	private String nrInmatriculare;

	public String getNrInmatriculare() {
		return nrInmatriculare;
	}

	public void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}

	public MijlocTransport(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
	
	public abstract void afisareNrInmatriculare();

}
