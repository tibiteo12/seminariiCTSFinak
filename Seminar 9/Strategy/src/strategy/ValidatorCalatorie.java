package strategy;

public class ValidatorCalatorie {
	private ModPlata modPlata;
	private double sumaPlata;

	public ValidatorCalatorie(double sumaPlata) {
		super();
		this.sumaPlata = sumaPlata;
		this.modPlata = new CardCalatorii();
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public void setSumaPlata(double sumaPlata) {
		this.sumaPlata = sumaPlata;
	}
	
	public void platesteCalatorie() {
		modPlata.platesteCalatorie(sumaPlata);
	}
}
