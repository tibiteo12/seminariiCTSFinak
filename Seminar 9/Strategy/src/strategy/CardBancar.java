package strategy;

public class CardBancar implements ModPlata {

	@Override
	public void platesteCalatorie(double sumaPlata) {
		System.out.println("S-a platit cu cardul bancar suma de " + sumaPlata);
		
	}

}
