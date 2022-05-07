package factory;

import simpleFactory.Autobuz;
import simpleFactory.MijlocTransport;
import simpleFactory.TipTransport;
import simpleFactory.Tramvai;
import simpleFactory.Troileibuz;

public class Fabrica {
	public MijlocTransport getMijlocTransport(TipTransport tipTransport, String nrInmatriculare) {
		switch (tipTransport) {
		case Autobuz:
			return new Autobuz(nrInmatriculare);
		case Troileibuz:
			return new Troileibuz(nrInmatriculare);
		case Tramvai:
			return new Tramvai(nrInmatriculare);
		default: 
			return null;
		}

			
	}
}
