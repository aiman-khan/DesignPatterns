/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.github;

/**
 *
 * @author FA18-BSE-057
 */
public class NotWorkingState implements State{
    @Override
	public void doAction() {
		System.out.println("TV is not working");
		
	}
}
