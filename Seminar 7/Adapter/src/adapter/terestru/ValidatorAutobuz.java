package adapter.terestru;

public class ValidatorAutobuz implements ValidatorTerestru {

	@Override
	public void valideazaBilet() {
		System.out.println("Bilet autobuz validat.");

	}

	@Override
	public void valideazaAbonament() {
		System.out.println("Abonament autobuz validat.");

	}

}
