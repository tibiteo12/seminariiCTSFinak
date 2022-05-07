package memento;

public class Autobuz {
	private String numeSofer;
	private float consum;
	private int an;
	private String model;
	private int nrLoc;

	public String getNume() {
		return numeSofer;
	}

	public void setNume(String nume) {
		this.numeSofer = nume;
	}

	public float getConsum() {
		return consum;
	}

	public void setConsum(float consum) {
		this.consum = consum;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNrLoc() {
		return nrLoc;
	}

	public void setNrLoc(int nrLoc) {
		this.nrLoc = nrLoc;
	}

	public Autobuz(String nume, float consum, int an, String model, int nrLoc) {
		super();
		this.numeSofer = nume;
		this.consum = consum;
		this.an = an;
		this.model = model;
		this.nrLoc = nrLoc;
	}

	@Override
	public String toString() {
		return "Autobuz [nume=" + numeSofer + ", consum=" + consum + ", an=" + an + ", model=" + model + ", nrLoc=" + nrLoc
				+ "]";
	}
	
	public AutobuzMemento save() {
		AutobuzMemento nou = new AutobuzMemento(this.numeSofer, this.consum);
		return nou;
	}
	
	public void undo(AutobuzMemento a) {
		this.numeSofer = a.getSofer();
		this.consum = a.getConsumMediu();
	}

}
