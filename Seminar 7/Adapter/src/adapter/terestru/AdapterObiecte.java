package adapter.terestru;

import adapter.subteran.ValidatorMetrou;

public class AdapterObiecte implements ValidatorTerestru {

	private ValidatorMetrou validatorMetrou;

	public AdapterObiecte(ValidatorMetrou validatorMetrou) {
		super();
		this.validatorMetrou = validatorMetrou;
	}

	@Override
	public void valideazaBilet() {
		validatorMetrou.valideazaCalatorie();
	}

	@Override
	public void valideazaAbonament() {
		validatorMetrou.valideazaAbonament();

	}

}
