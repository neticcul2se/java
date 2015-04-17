/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Pae
 */
public class Test {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        
        // TODO code application logic here
       
Thread t = Thread.currentThread();
    t.setName("pae");
     t.setPriority(1);
    System.out.println(t.getName());
     
            System.out.println(t.getPriority());
            System.out.println(t.isAlive());
                System.out.println(t.isDaemon());
    }
    
}
