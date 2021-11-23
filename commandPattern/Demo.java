/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandPattern;

import java.util.Scanner;

/**
 *
 * @author FA18-BSE-057
 */
public class Demo {

    public static void main(String[] args) {
        boolean flag = true;
        FileSystemReciever reciever;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);
        if (osName.contains("windows")) {
            reciever = new WindowsFileSystemReciever();
        } else {
            reciever = new UnixFileSystemReciever();
        }
        Command cmd = new OpenFileCommand(reciever);
        FileInvoker invoker = new FileInvoker(cmd);
        invoker.execute();

        invoker.undo();
        
        

        cmd = new CloseFileCommand(reciever);
        invoker = new FileInvoker(cmd);
        invoker.execute();

        invoker.undo();
        
        do {
            cmd = new WriteFileCommand(reciever);
            invoker = new FileInvoker(cmd);
            invoker.execute();
            System.out.println("Do you want to exit the application? y/n\n");
            String choice;
            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine();
            
            if (choice.contains("y")) {
                flag = false;
                cmd = new CloseFileCommand(reciever);
                invoker = new FileInvoker(cmd);
                invoker.execute();
            }

        }
      
        while (flag != false);
        
    }
}
