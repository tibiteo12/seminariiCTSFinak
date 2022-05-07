package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nume;
	private Ingrijitor ingrijitor;
	private List<Animal> animale;
	
	public void hranesteAnimale() {
		for(Animal a: animale) {
			ingrijitor.hranesteAnimal(a, "fan");
		}
	}

	public Zoo(String nume, Ingrijitor ingrijitor) {
		this.nume = nume;
		this.ingrijitor = ingrijitor;
		animale = new ArrayList<>();
	}
	
	public void addAnimal(Animal animal) {
		animale.add(animal);
	}
	
	//nu trebuie sa depindem de clasele concrete si doar de tipul abstract
	
	
	
	
	
	
}
