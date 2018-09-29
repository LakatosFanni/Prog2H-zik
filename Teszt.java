///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Fannu
// */
public class Teszt {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6, 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println("Az r1 kerülete: " +r1.getPerimeter());
        System.out.println("Az r1 terulete " +r1.getArea());
        System.out.println("Az r2 kerülete: " +r2.getPerimeter());
        System.out.println("Az r2 terulete " +r2.getArea());
        System.out.println("Az r3 kerülete: " +r3.getPerimeter());
        System.out.println("Az r3 terulete " +r3.getArea());
    }
//        

//    
//    
//QuadraticEquation e1= new QuadraticEquation(1, 2, 3);
//QuadraticEquation e2= new QuadraticEquation(2, 4, 1);
//QuadraticEquation e3 = new QuadraticEquation(-5, 1, -3);
//
//
//
// System.out.println("x1="+e1.getRoot1()+" "+"x2="+e1.getRoot2());
// System.out.println("x1="+e2.getRoot1()+" "+ "x2="+e2.getRoot2());
// System.out.println("x1="+e3.getRoot1()+" "+ "x2=" +e3.getRoot2());
                    
        
          
          
         
} 
 
