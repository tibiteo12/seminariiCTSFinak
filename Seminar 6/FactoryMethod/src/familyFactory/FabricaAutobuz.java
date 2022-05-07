package familyFactory;

import factoryMethod.*;

public class FabricaAutobuz implements AbstractFactory {

	@Override
	public MijlocTransport getMijlocTransport(String nrInmatriculare) {
		return new Autobuz(nrInmatriculare);
	}

}
