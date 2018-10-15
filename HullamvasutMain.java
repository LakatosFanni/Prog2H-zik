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
public class HullamvasutMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String sor = sc.nextLine();
        
        int n = Integer.parseInt(sor);
        
        ArrayList<Hullamvasutak>hullamvasutak =new ArrayList<>();
                
        
        for ( int i = 0; i<n; i++) {
            sor = sc.nextLine();
            String darabok[] = sor.split(";");
            
            Hullamvasutak h = new Hullamvasutak(darabok[0], darabok[1]);
            hullamvasutak.add(h);
      
        }
        Collections.sort(hullamvasutak);
        
        System.out.println("");
        
        for(Hullamvasutak h:hullamvasutak){
            System.out.println(hullamvasutak.toString());
        }
    }
}
