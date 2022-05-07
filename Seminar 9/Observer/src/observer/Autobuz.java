package observer;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subject{

	List<Observer> observeri;
	String anunt;
	
	public Autobuz(String anunt) {
		super();
		this.anunt = anunt;
		this.observeri = new ArrayList<Observer>();
	}

	public List<Observer> getObserveri() {
		return observeri;
	}

	public void setObserveri(List<Observer> observeri) {
		this.observeri = observeri;
	}

	public String getAnunt() {
		return anunt;
	}

	public void setAnunt(String anunt) {
		this.anunt = anunt;
	}

	@Override
	public void adaugaObserver(Observer obs) {
		observeri.add(obs);
		
	}

	@Override
	public void eliminaObserver(Observer obs) {
		observeri.remove(obs);
		
	}

	@Override
	public void anuntaCalator() {
		for(Observer obs:observeri) {
			obs.primesteAnunt(anunt);
		}
		
	}

	
	
	
}
