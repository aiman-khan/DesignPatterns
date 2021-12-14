/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod.tutorialpoint;

/**
 *
 * @author FA18-BSE-057
 */
public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();
   abstract void performShiftNow();

   //template method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();
      
      //perform shift
      performShiftNow();
      startPlay();

      //end game
      endPlay();
      
      //break for refreshment
      breakForRefreshment();
      
      
   }
   
   private void breakForRefreshment() {
       System.out.println("Take break for refreshment");
   }
  
}
