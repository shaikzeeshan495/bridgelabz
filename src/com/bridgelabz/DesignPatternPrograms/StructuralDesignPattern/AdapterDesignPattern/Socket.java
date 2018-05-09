package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.AdapterDesignPattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}
