package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
       }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
