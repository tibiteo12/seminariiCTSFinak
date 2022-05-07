package chainOfResponsability;

public abstract class MijlocTransportHandler {
	MijlocTransportHandler mijlocTransportUrmator;
	protected int pragSuperior;

	public MijlocTransportHandler getMijlocTransportUrmator() {
		return mijlocTransportUrmator;
	}

	public void setMijlocTransportUrmator(MijlocTransportHandler mijlocTransportUrmator) {
		this.mijlocTransportUrmator = mijlocTransportUrmator;
	}
	
	public MijlocTransportHandler(int pragSuperior) {
		super();
		this.mijlocTransportUrmator = null;
		this.pragSuperior = pragSuperior;
	}

	public abstract void recomandaMijlocTransport(double distanta);
}
