package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
	List<AutobuzMemento> listaAutobuzeMemento;

	public ManagerAutobaza() {
		listaAutobuzeMemento = new ArrayList<>();
	}

	public ManagerAutobaza(List<AutobuzMemento> listaAutobuzeMemento) {
		super();
		this.listaAutobuzeMemento = listaAutobuzeMemento;
	}

	public void add(AutobuzMemento a) {
		listaAutobuzeMemento.add(a);
	}
	
	public AutobuzMemento getMemento(int pozitie) {
		return listaAutobuzeMemento.get(pozitie);
		
	}
}
