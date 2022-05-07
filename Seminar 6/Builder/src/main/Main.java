package main;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;

public class Main {
	public static void main(String[] args) {
		AutobuzLinie autobuz1 = new AutobuzBuilder().setModelAutobuz("Ford").setNumeSofer("Vasile").build();
		AutobuzLinie autobuz2 = new AutobuzBuilder().setNrInmatriculare("B2234").build();
		
		System.out.println(autobuz1.toString());
		System.out.println(autobuz2.toString());
	}
}
