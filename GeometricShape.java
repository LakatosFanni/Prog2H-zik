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
public class GeometricShape {
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    public GeometricShape(){
       this("white", false);
    }

    public GeometricShape(String color, boolean filled) {
       this.color = color;
       this.filled = filled;
       this.dateCreated = new Date();
        
    }
    public  String getColor() {
        return color;
    }

    public  boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricShape{" + "dateCreated=" + dateCreated + '}';
    }
    
 
}

