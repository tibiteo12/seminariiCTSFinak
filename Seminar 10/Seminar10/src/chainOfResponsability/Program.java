package chainOfResponsability;

public class Program {
	public static void main(String[] args) {
		MijlocTransportHandler handlerAutobuz = new AutobuzHandler(5);
		MijlocTransportHandler handlerMetrou = new MetrouHandler(100000);
		MijlocTransportHandler handlerTramvai = new MetrouHandler(10);
		MijlocTransportHandler handlerTroleibuz= new MetrouHandler(3);
		
		handlerTroleibuz.setMijlocTransportUrmator(handlerAutobuz);
		handlerAutobuz.setMijlocTransportUrmator(handlerTramvai);
		handlerTramvai.setMijlocTransportUrmator(handlerMetrou);
		
		handlerTroleibuz.recomandaMijlocTransport(2);
		handlerTroleibuz.recomandaMijlocTransport(4);
		handlerTroleibuz.recomandaMijlocTransport(8);
		handlerTroleibuz.recomandaMijlocTransport(12);
		
		MijlocTransportHandler handlerAutobuzCluj = new AutobuzHandler(2);
		MijlocTransportHandler handlerMetrouCluj = new MetrouHandler(10000000);
		MijlocTransportHandler handlerTramvaiCluj = new MetrouHandler(4);
		MijlocTransportHandler handlerTroleibuzCluj = new MetrouHandler(6);
		
		handlerMetrouCluj.setMijlocTransportUrmator(handlerTramvaiCluj);
		handlerTramvaiCluj.setMijlocTransportUrmator(handlerTroleibuzCluj);
		handlerTroleibuzCluj.setMijlocTransportUrmator(handlerAutobuzCluj);
		
		handlerMetrouCluj.recomandaMijlocTransport(5);
		handlerMetrouCluj.recomandaMijlocTransport(1);
		handlerMetrouCluj.recomandaMijlocTransport(25);
	}
}
