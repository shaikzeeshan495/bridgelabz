/******************************************************************************
 *  Purpose:	ShapeMaker
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.FacadeDesignPattern;

public class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   
	   public void drawSquare(){
	      square.draw();
	   }
	}
