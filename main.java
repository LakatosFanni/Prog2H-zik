
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class main {

    private static Pékség[] adottPékárutÁrusítóP(String psüti, keregység [] ker) {
        int count = 0;
        
        for (int i=0; i<ker.length; i++){
            if(ker[i] instanceof Pékség){
                Pékség p=(Pékség)ker[i];
                
                for(int j=0; j<p.getPékÁruk().length; j++){
                    if(p.getPékÁruk()[j].equals(psüti)){
                        count++;
                    }
                }
            }                
        }  
       Pékség [] pékség = new Pékség[count];
      int k = 0; 
      for (int i=0; i<ker.length; i++){
            if(ker[i] instanceof Pékség){
                Pékség p=(Pékség)ker[i];
                
                for(int j=0; j<p.getPékÁruk().length; j++){
                    if(p.getPékÁruk()[j].equals(psüti)){
                        pékség[k]=p;
                         k++;       
                    }
                }
            }                
        }  

      return pékség;
     
    }
    public static void main(String[] args) {
        
        keregység [] ker = new keregység[] {
        new Pékség("Aranycipó", "Egy. 1", new Date(), new String [] {"kifli", "pogácsa", "kenyér"}),
        new Pékség("Spar", "Egy. 2", new Date(), new String [] {"kifli", "pogácsa", "kakaóscsiga"}),
        new Dohánybolt("Ronson","Egy. 3", new Date(), new String [] {"Kent", "Bond"}),
        new Pékség("Buci", "Egy. 4", new Date(), new String [] {"zsemle", "pogácsa", "kenyér"})
        };
        
       Pékség[] pék= adottPékárutÁrusítóP("kenyér", ker);
        for (Pékség p:pék) {
            System.out.println(p);
        }
    }
}
