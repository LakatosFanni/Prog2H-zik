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
public class Nyilas extends Katona {
    private int lotav;

    

    public Nyilas(int lotav, int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
        this.lotav = lotav;
    } 
    
public int getTamadoero(){
    return super.getTamadoero()+this.lotav;
}
    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: " + super.toString();
    }
  
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Nyilas)) {
            return false;
        }
        Nyilas ny = (Nyilas) obj;
        return super.getTamadoero()==ny.getTamadoero() && super.getVedoero()==ny.getVedoero()
                && this.lotav == ny.getLotav();
                
    }
   
}

