package memento;

public class AutobuzMemento {
	private String sofer;
	private float consumMediu;

	public AutobuzMemento(String sofer, float consumMediu) {
		super();
		this.sofer = sofer;
		this.consumMediu = consumMediu;
	}

	public String getSofer() {
		return sofer;
	}

	public void setSofer(String sofer) {
		this.sofer = sofer;
	}

	public float getConsumMediu() {
		return consumMediu;
	}

	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}

	@Override
	public String toString() {
		return "AutobuzMemento [sofer=" + sofer + ", consumMediu=" + consumMediu + "]";
	}

	
}
