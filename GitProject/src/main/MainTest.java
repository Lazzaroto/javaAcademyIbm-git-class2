package main;

import classi.Persona;

public class MainTest {

	public static void main(String[] args) {
		Persona p = new Persona("Fabrizio", "Fonte");
		Persona p2 = new Persona("Marco", "Dignazio");
		System.out.println(p.toString());
		System.out.println(p2.toString());

	}

}
