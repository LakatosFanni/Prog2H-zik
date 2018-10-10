/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhw;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Fannu
 */
public class Autó {
    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátuma; 

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        Date dátum = gyártásDátuma;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", motorTeljes\u00edtm\u00e9ny=" + motorTeljesítmény + ", gy\u00e1rt\u00e1sD\u00e1tuma=" + gyártásDátuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.gyártásDátuma);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null ||!(obj instanceof Autó)){
            return false;
        } 
        Autó a = (Autó) obj;
        
       return this.motorTeljesítmény.equals(a.motorTeljesítmény())
               &&this.rendszám.equals(a.getRendszám())
               &&this.gyártásDátuma.equals(a.getGyártásDátuma());
    }
    
    
}
