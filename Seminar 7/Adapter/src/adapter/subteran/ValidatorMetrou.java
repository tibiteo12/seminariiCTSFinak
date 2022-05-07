package adapter.subteran;

public class ValidatorMetrou implements ValidatorSubteran {

	@Override
	public void valideazaCalatorie() {
		System.out.println("Calatorie metrou validata.");

	}

	@Override
	public void valideazaAbonament() {
		System.out.println("Abonament metrou validat.");

	}

}
