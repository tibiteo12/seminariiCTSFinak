package main;

import singleton.Singleton;

public class Main {
	public static void main(String[] args) {
		Singleton singleton;
		singleton = Singleton.getInstanta();
		
		Singleton singleton2;
		singleton2 = Singleton.getInstanta();
		
		System.out.println(singleton);
		System.out.println(singleton2);
	}
}
