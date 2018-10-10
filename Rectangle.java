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
public class Rectangle extends GeometricShape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return this.height*this.width;
    }
    
    public double getPerimeter(){
      return 2*(this.height+this.width);
    }
      
    public Rectangle (){
        super();
    }
    public Rectangle (String color, boolean filled){
        super(color, filled);
    }
    
    public Rectangle (double width, double height){
        super();
        this.width=width;
        this.height=height;
    }
    
    public Rectangle (double width, double height, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.height=height;
        
    }
}
