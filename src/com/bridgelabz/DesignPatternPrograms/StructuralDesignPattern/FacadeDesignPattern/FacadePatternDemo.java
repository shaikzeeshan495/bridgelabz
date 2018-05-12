/******************************************************************************
 *  Purpose:	FacadePatternDemo to create object for shopmaker
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.FacadeDesignPattern;

public class FacadePatternDemo {
	   public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();
	      
	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
	}