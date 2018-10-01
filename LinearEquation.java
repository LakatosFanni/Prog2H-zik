/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fannu
 */
public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
   
    
    public LinearEquation (int a, int b, int c, int d, int e, int f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
    
    public static boolean isSolvable (int a, int b, int c, int d) {
        if ((a*d)-b*c!=0) {
            return false ;
        }
        else {
            return true;
        }
    }
    
 public double getX (){
     return ((this.e*this.d)-(this.b*this.f))/ ((this.a*this.d)-(this.b*this.c));
 }
 public double getY (){
     return ((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c));
 }

         
   

}

        