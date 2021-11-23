/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandPattern;

/**
 *
 * @author FA18-BSE-057
 */


public interface Command {

    void execute();

    void undo();
}
