package observer;

public class Calator implements Observer{
	String nume;
	

	public void setNume(String nume) {
		this.nume = nume;
	}


	public Calator(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primesteAnunt(String anunt) {
		System.out.println("Am primit anuntul " + anunt + " de la calatorul " + nume);
		
	}

}
