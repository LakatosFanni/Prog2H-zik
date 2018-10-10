/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhw;

/**
 *
 * @author Fannu
 */
public class Kocsma extends VendéglátóipariEgység {
    private String[]sörlap;
    boolean dohányzó = true;
    
    public Kocsma(String név, int férőhelyekSzáma, String[] sörlap){
        super(név, férőhelyekSzáma, true);
        this.sörlap=sörlap;
    } 

    public String[] getSörlap() {
        return sörlap;
    }

    @Override
    public String toString() {
        return super.toString() + sörlap + dohányzó;
    }
    
    
    
    
}
