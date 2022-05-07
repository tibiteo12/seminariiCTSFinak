package chainOfResponsability;

public class TroleibuzHandler extends MijlocTransportHandler {

	public TroleibuzHandler(int pragSuperior) {
		super(pragSuperior);
	}

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta < super.pragSuperior) {
			System.out.println("Vom folosi troleibuzul ca mijloc de trasport pentru " + distanta + " km.");
		} else {
			super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
		}
		
	}

}
