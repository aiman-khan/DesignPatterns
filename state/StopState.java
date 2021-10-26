/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;
/**
 *
 * @author FA18-BSE-057
 */
public class StopState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);	
   }

   @Override
   public String toString(){
      return "Stop State";
   }
}