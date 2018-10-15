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
public class Szopar implements Comparable<Szopar>{ 
    //adattagok
    private String angol_szo;
    private String magyar_szo;
    //adattagok feltöltése értékekkel, konstruktor
    public Szopar(String angol_szo, String magyarszo) {
        this.angol_szo=angol_szo;
        this.magyar_szo= magyar_szo;
        
    }
//összehasonlítást végez azon az objektumon, amelyiken meghívták, és azon amit paraméterként megkap
    //ebben a feladatban a collections.sort() fogja használni és meghívni
    @Override
    public int compareTo(Szopar masik) { 
        int angolSzoOsszehasonlítasEredmenye= this.angol_szo.compareTo(masik.angol_szo);
        //megnézzuk h a két angol szo egyenlo e
        if (angolSzoOsszehasonlítasEredmenye==0){
            // magyar szo szerint hasonlit 
            
            
         int magyarSzoOsszehasonlitasEredmenye=this.magyar_szo.compareTo(masik.magyar_szo);
         return magyarSzoOsszehasonlitasEredmenye;
    
        }
        //nem egyezett meg a két angol szó, tehát visszaadom melyik angol szo van előrébb az abc.ben;
        return angolSzoOsszehasonlítasEredmenye;
        
    }
//szebb formában történik a kiíratás
    @Override
    public String toString() {
        return this.angol_szo + ":" + this.magyar_szo;
    }
    
    
    
}
