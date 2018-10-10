/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhw;

import java.util.Date;

/**
 *
 * @author Fannu
 */
public class Circle extends GeometricShape {
    private double radius;
    
    public Circle (String color, boolean filled) {
        super(color, filled);
    } 
     
    public Circle (){
        super();
    }
    
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super();
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
            
    public double getArea(){
        return 2*radius*Math.PI;
    }
    
    public double getPerimeter() {
        return radius*radius*Math.PI;
    }
    
    public double getDiameter(){
        return 2*radius;
    }
}
