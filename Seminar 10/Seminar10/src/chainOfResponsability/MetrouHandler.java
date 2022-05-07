package chainOfResponsability;

public class MetrouHandler extends MijlocTransportHandler {

	public MetrouHandler(int pragSuperior) {
		super(pragSuperior);
	}

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta < super.pragSuperior) {
			System.out.println("Vom folosi metroul ca mijloc de trasport pentru " + distanta + " km.");
		} else {
			super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
		}
		
	}

}
