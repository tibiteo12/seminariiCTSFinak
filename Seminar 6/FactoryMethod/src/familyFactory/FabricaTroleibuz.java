package familyFactory;

import factoryMethod.*;

public class FabricaTroleibuz implements AbstractFactory {

	@Override
	public MijlocTransport getMijlocTransport(String nrInmatriculare) {
		return new Troileibuz(nrInmatriculare);
	}
}
