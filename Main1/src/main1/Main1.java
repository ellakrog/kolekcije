/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;


public class Main1 {

  
    public static void main(String[] args) {
        Chocolate c=new Chocolate("milka", 786598675, 20,300);
        c.show();
        System.out.println(c.Izracun(20));
       
       Wine w=new Wine("frankovka", 8765, 100.8,50);
       w.show();
       System.out.println(w.Izracun(100.8));
    }
    
}
