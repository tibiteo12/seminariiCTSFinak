package main.flyweight;

public class Linie implements IAutobuz {
	int nrLinie;
	String primaStatie;
	String ultimaStatie;

	@Override
	public String toString() {
		return "Linie [nrLinie=" + nrLinie + ", primaStatie=" + primaStatie + ", ultimaStatie=" + ultimaStatie + "]";
	}

	public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
		super();
		this.nrLinie = nrLinie;
		this.primaStatie = primaStatie;
		this.ultimaStatie = ultimaStatie;
	}

	public int getNrLinie() {
		return nrLinie;
	}

	@Override
	public void descriereAutobuz(Autobuz autobuz) {
		System.out.println(autobuz.toString() + toString());
	}
}
