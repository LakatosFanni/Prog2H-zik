/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdhw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Fannu
 */
public class SzoparMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //beolvassuk az első sort, aminek egy db szamot kell tartalmaznia
        String sor = sc.nextLine(); 
        //átalakítjuk számmá a szöveget, mert szövegként olvastuk be
        int n = Integer.parseInt(sor);
        
        //n db sort olvasunk be  és dolgozzuk fel
        ArrayList<Szopar> szoparok = new ArrayList<>();
        //ebben taroljuk a forban létrehozott szoparokat, pontosan n dbot mert nincs mérete, rugalmasabb mint a tömb
        
        for(int i = 0;i<n; i++){
            //beolvassuk a következő sort
            sor = sc.nextLine();
            //feldaraboljuk a megadott karakter mentén
            String[] darabok = sor.split(":"); 
            //létrehozok egy szópar objektumot, megadom neki az ang magyar szavakat
            Szopar szopar = new Szopar(darabok[0], darabok[1]);
            szoparok.add(szopar); //hozzaadom 
            
            
        }
        //a rendezés itt történik meg, meg fogja hívni a compareto metódust ahányszor kell, hogy rendezett legyen a lista 
        Collections.sort(szoparok); 
        
        System.out.println(); // ne folyjon össze 
        
        //foreach ciklus
        // két részből áll, Szopar szopar = ciklusváltozó
        // : szoparok = melyik listán megyünk végig 
                for( Szopar szopar: szoparok) {
                    System.out.println(szopar.toString());
                }
    }
}
