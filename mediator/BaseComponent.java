/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author FA18-BSE-057
 */
public class BaseComponent {
    protected Mediator mediator;    
    public void setMediator(Mediator objMediator){
        this.mediator = objMediator;
    }
}
