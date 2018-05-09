package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

public class EnumDemo {
	public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
     
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());

    }

}
