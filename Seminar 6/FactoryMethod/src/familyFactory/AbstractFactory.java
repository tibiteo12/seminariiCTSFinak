package familyFactory;

import factoryMethod.MijlocTransport;

public interface AbstractFactory {
	public MijlocTransport getMijlocTransport(String nrInmatriculare);
}
