package memento;

public class Program {
	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("Andrei", 3, 2010, "Audi", 20);
		ManagerAutobaza manager = new ManagerAutobaza();
		manager.add(autobuz.save());
		
		autobuz.setNume("Mihai");
		manager.add(autobuz.save());
		
		autobuz.setConsum(5);
		manager.add(autobuz.save());
		
		System.out.println(autobuz.toString());
		
		autobuz.undo(manager.getMemento(0));
		System.out.println(autobuz.toString());
	}
}
