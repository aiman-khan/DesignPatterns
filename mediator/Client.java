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
public class Client {
   public static void main(String[] args) {
        // 1. Initiate concrete colleques
        ConcreteColleaque1 objColleaque1 = new ConcreteColleaque1();
        ConcreteColleaque2 objColleaque2 = new ConcreteColleaque2();
        // 2. Initiate mediator with controlling components
        Mediator objM =  new ConcreteMediator(objColleaque1, objColleaque2);
        // 3. Ask Mediator to perform operations
        objM.operationA();        
        objM.operationD();
   } 
}
