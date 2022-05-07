package chainOfResponsability;

public class TramvaiHandler extends MijlocTransportHandler{

	public TramvaiHandler(int pragSuperior) {
		super(pragSuperior);
	}

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta < super.pragSuperior) {
			System.out.println("Vom folosi tramvaiul ca mijloc de trasport pentru " + distanta + " km.");
		} else {
			super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
		}
		
	}

}
