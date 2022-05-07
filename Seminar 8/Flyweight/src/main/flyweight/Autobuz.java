package main.flyweight;

public class Autobuz {
	String model;
	int anFabricatie;
	int nrLocuri;

	public Autobuz(String model, int anFabricatie, int nrLocuri) {
		super();
		this.model = model;
		this.anFabricatie = anFabricatie;
		this.nrLocuri = nrLocuri;
	}

	@Override
	public String toString() {
		return "Autobuz [model=" + model + ", anFabricatie=" + anFabricatie + ", nrLocuri=" + nrLocuri + "]";
	}

}
