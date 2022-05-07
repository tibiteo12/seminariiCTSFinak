package zoo;

public class Girafa extends Animal{
	
	public Girafa(String nume) {
		super(nume);
	}

	@Override
	public void mananca(String mancare) {
		System.out.println("Girafa " + super.getNume() +" a mancat " + mancare);
	}
}
