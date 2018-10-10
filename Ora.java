/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhw.Iskola;

/**
 *
 * @author Fannu
 */
public class Ora {
     private int kód;
    private String név;
    private int kezdet;

    public Ora(int kód, String név, int kezdés) {
        this.kód = kód;
        this.név = név;
        this.kezdet = kezdés;
        if(kezdés < 8){
            this.kezdet=8;
        }
        if(kezdés>19){
            this.kezdet=19;
        }
    }

    public int getKód() {
        return kód;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Kód:" +kód + " név:" + név + " kezdet:" + kezdet;
    }
    
    

}
