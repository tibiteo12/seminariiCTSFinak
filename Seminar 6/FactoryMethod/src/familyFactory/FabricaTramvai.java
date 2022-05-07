package familyFactory;

import factoryMethod.*;

public class FabricaTramvai implements AbstractFactory {

	@Override
	public MijlocTransport getMijlocTransport(String nrInmatriculare) {
		return new Tramvai(nrInmatriculare);
	}

}
