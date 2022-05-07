package main;

import zoo.Girafa;
import zoo.Ingrijitor;
import zoo.Zebra;
import zoo.Zoo;

public class main {
	public static void main (String[] args) {
		Ingrijitor ingrijitor = new Ingrijitor("Liam Smith");
		
		Zoo zoo = new Zoo("Gradina zoologica", ingrijitor);
		
		zoo.addAnimal(new Girafa("Lucas"));
		zoo.addAnimal(new Girafa("Maria"));
		zoo.addAnimal(new Zebra("Bob"));
		
		zoo.hranesteAnimale();
	}
}
