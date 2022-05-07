package strategy;

public class SMS implements ModPlata{

	@Override
	public void platesteCalatorie(double sumaPlata) {
		System.out.println("S-a platit prin SMS suma de " + sumaPlata);
		
	}

}
