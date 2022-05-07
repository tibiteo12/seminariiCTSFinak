package main;

import strategy.CardBancar;
import strategy.SMS;
import strategy.ValidatorCalatorie;

public class main {

	public static void main(String[] args) {
		ValidatorCalatorie validator = new ValidatorCalatorie(3);
		
		validator.platesteCalatorie();
		
		validator.setModPlata(new CardBancar());
		validator.platesteCalatorie();
		validator.setModPlata(new SMS());
		validator.platesteCalatorie();
	}

}
