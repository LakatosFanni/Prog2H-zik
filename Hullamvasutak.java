/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdhw;

/**
 *
 * @author Fannu
 */
public class Hullamvasutak implements Comparable<Hullamvasutak> {
    private String hullamvasut_neve;
    private String vilag_neve;
    private int legkisebb_magassag;
    private int varakozasi_ido;

    public Hullamvasutak(String hullamvasut_neve, String vilag_neve, int legkisebb_magassag, int varakozasi_ido) {
        this.hullamvasut_neve = hullamvasut_neve;
        this.vilag_neve = vilag_neve;
        this.legkisebb_magassag = legkisebb_magassag;
        this.varakozasi_ido = varakozasi_ido;
    }
    
public Hullamvasutak(String hullamvasut_neve, String vilag_neve){
    this.hullamvasut_neve=hullamvasut_neve;
    this.vilag_neve=vilag_neve;
} 

    public String getHullamvasut_neve() {
        return hullamvasut_neve;
    }

    public String getVilag_neve() {
        return vilag_neve;
    }

    public int getLegkisebb_magassag() {
        return legkisebb_magassag;
    }

    public int getVarakozasi_ido() {
        return varakozasi_ido;
    }


    @Override
    public int compareTo(Hullamvasutak another) {
        int varakozasiIdo1 = this.varakozasi_ido;
        int varakozasiIdo2 = another.varakozasi_ido;
        
        if(varakozasiIdo1==varakozasiIdo2){
            int legkisebbMagassag1=this.legkisebb_magassag;
            int legkisebbMagassag2 = this.legkisebb_magassag;
            
            if(legkisebbMagassag1==legkisebbMagassag2){
                return this.hullamvasut_neve.compareTo(another.hullamvasut_neve);
            }
           return 1;
       }
        return 1;
        
    }

 
    
}
