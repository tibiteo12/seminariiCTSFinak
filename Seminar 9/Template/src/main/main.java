package main;

import template.Tramvai;
import template.TramvaiProbe;

public class main {

	public static void main(String[] args) {
		Tramvai tramvai = new Tramvai();
		tramvai.parcurgeTraseuNormal();
		System.out.println("\n");
		tramvai.parcurgeTraseuInvers();
		
		TramvaiProbe tramvaiProbe = new TramvaiProbe();
		tramvai.parcurgeTraseuNormal();

	}

}
