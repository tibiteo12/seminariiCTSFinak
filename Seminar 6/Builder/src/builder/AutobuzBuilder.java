package builder;

public class AutobuzBuilder implements Builder {

	private AutobuzLinie instanta;

	@Override
	public AutobuzLinie build() {
		return instanta;
	}

	public AutobuzBuilder() {
		this.instanta = new AutobuzLinie();
	}

	public AutobuzBuilder setModelAutobuz(String modelAutobuz) {
		instanta.setModelAutobuz(modelAutobuz);
		return this;
	}

	public AutobuzBuilder setNumeSofer(String numeSofer) {
		instanta.setNumeSofer(numeSofer);
		return this;
	}

	public AutobuzBuilder setOprireCapat(boolean oprireCapat) {
		instanta.setOprireCapat(oprireCapat);
		return this;
	}

	public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
		instanta.setDeschideUsi(deschideUsi);
		return this;
	}

	public AutobuzBuilder setTextDerulat(String textDerulat) {
		instanta.setTextDerulat(textDerulat);
		return this;
	}

	public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
		instanta.setNrInmatriculare(nrInmatriculare);
		return this;
	}

}
