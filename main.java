/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fannu
 */
public class main {
    public static void main(String[] args) {
        Pont p1=new Pont();
        Pont p2=new Pont();
        Pont p3=new Pont();
        Pont p4=new Pont();
        
        p1.setK2(p1.getK2()+5);
        p2.setK2(p2.getK2()+5);
        p3.setK1(p3.getK1()-3.4);
        p4.setK1(p4.getK1()-3.4);
       
        System.out.println(p1.getK2());
        System.out.println(p2.getK2());
        System.out.println(p3.getK1());
        System.out.println(p4.getK1());
        
                 
       
    }
}
