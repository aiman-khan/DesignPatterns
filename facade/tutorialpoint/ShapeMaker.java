/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.tutorialpoint;

/**
 *
 * @author FA18-BSE-057
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape oval;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      oval = new Oval();
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
   public void drawOval(){
       oval.draw();
   }
}
