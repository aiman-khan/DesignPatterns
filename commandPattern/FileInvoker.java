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

public class FileInvoker {
    // implement stack

    Command cmd;
    boolean flag;

    public FileInvoker(Command cmd) {
        this.cmd = cmd;
    }

    void execute() {
        cmd.execute();
        flag = true;
    }

    void undo() {
        cmd.undo();
        flag = false;
    }

}
