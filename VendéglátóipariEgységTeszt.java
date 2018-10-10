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
public class VendéglátóipariEgységTeszt {
    
    private static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] t) {
        int count=0;
        
        for(int i=0; i<t.length;i++){
            if(t[i] instanceof Kocsma) {
                Kocsma k = (Kocsma)t[i];
            
            for(int j=0; j<k.getSörlap().length; j++){
                if(k.getSörlap()[j].equals(ital)){
                    count++;
                }
            }
        }
    }
        
        Kocsma [] kocsma = new Kocsma[count];
        int sz=0;
        for (int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma){
                Kocsma k = (Kocsma) t[i];
                
                for(int j=0; j<k.getSörlap().length; j++){
                    if(k.getSörlap()[j].equals(ital)){
                        kocsma[sz]=k;
                        sz++;
                              
                    }
                }
            }
        }
        return kocsma;
    }
    public static void main(String[] args) {
        
      VendéglátóipariEgység[] t = new VendéglátóipariEgység[] { 
      new Kocsma("Aladin", 30, new String []{"Borsodi", "Aranyfácán", "Heineken"}),
      new Étterem("Kristály", 40, new String []{"Csirkepörkölt", "Sertéspörkölt", "Pizza"}),
      new Kocsma("Ibolya", 50, new String []{"Borsodi", "Aranyfácán", "Kőbányai"}),
      new Étterem("Gyémánt", 40, new String []{"Csirkepörkölt", "Rántotthús", "Pizza"}),
      new Kocsma("Kocka", 44, new String []{"IPA", "Aranyfácán", "Heineken"}),
      new Étterem("Zafír", 40, new String []{"Csirkepörkölt", "Sertéspörkölt", "Hot-Dog"}),
      new Kocsma("Skarlát", 30, new String []{"Borsodi", "IPA", "Heineken"}),
      new Étterem("Rubin", 40, new String []{"Kacsapecsenye", "Sertéspörkölt", "Pizza"}),
      new Kocsma("Vörös Ördög", 30, new String []{"Borsodi", "Aranyfácán", "Soproni"}),
      new Étterem("Kristály", 40, new String []{"Töltöttkáposzta", "Sertéspörkölt", "Hamburger"})
      }; 
      Kocsma[] kcsm= adottItaltKínálóKocsmák("Borsodi", t);
      for (Kocsma k:kcsm) {
          System.out.println(k);
      }

    } 

   
}



