/******************************************************************************
 *  Purpose:	EnumDemo
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   09-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

public class EnumDemo {
	public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
     
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());

    }

}
