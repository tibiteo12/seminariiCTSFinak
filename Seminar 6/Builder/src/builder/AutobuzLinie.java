package builder;

public class AutobuzLinie {
	private String modelAutobuz;
	private String numeSofer;
	private boolean oprireCapat;
	private boolean deschideUsi;
	private String textDerulat;
	private String nrInmatriculare;

	void setModelAutobuz(String modelAutobuz) {
		this.modelAutobuz = modelAutobuz;
	}

	void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	void setOprireCapat(boolean oprireCapat) {
		this.oprireCapat = oprireCapat;
	}

	void setDeschideUsi(boolean deschideUsi) {
		this.deschideUsi = deschideUsi;
	}

	void setTextDerulat(String textDerulat) {
		this.textDerulat = textDerulat;
	}

	void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}

	public AutobuzLinie() {
		super();
		this.modelAutobuz = "Mercedes";
		this.numeSofer = "Dorel";
		this.oprireCapat = true;
		this.deschideUsi = true;
		this.textDerulat = "STB - in miscare";
		this.nrInmatriculare = "B555STB";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AutobuzLinie [modelAutobuz=");
		builder.append(modelAutobuz);
		builder.append(", numeSofer=");
		builder.append(numeSofer);
		builder.append(", oprireCapat=");
		builder.append(oprireCapat);
		builder.append(", deschideUsi=");
		builder.append(deschideUsi);
		builder.append(", textDerulat=");
		builder.append(textDerulat);
		builder.append(", nrInmatriculare=");
		builder.append(nrInmatriculare);
		builder.append("]");
		return builder.toString();
	}

}
