package adapter.terestru;

import adapter.subteran.ValidatorMetrou;

public class ValidatorAdapter extends ValidatorMetrou implements ValidatorTerestru {

	@Override
	public void valideazaBilet() {
		super.valideazaCalatorie();
	}

}
