package prototype;

public class Autobuz implements MijlocTransport{

	private String soferAutobuz;
	
	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport) super.clone();
	}

	public Autobuz(String soferAutobuz) {
		super();
		this.soferAutobuz = soferAutobuz;
	}

	public String getSoferAutobuz() {
		return soferAutobuz;
	}

	public void setSoferAutobuz(String soferAutobuz) {
		this.soferAutobuz = soferAutobuz;
	}
	
	
}
