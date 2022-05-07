package observer;

public interface Subject {
	public void adaugaObserver(Observer obs);
	public void eliminaObserver(Observer obs);
	public void anuntaCalator();
}
