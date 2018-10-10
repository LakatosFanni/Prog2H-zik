/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhw;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fannu
 */
public class MainJáték {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
       while(true){
         String valasztott;
        valasztott = sc.nextLine();
        if(valasztott.equals("vege")){
            break;
        }
        if(!valasztott.equals("ko") && !valasztott.equals("papir") && !valasztott.equals("ollo")){
            continue;
        }
        Random random = new Random();
        int gepaltalValasztott=random.nextInt(3);
           System.out.println("Gép ezt adta:" );
        if (gepaltalValasztott==0){
            System.out.println("Kő");
         }
        if (gepaltalValasztott==1){
            System.out.println("Papír");
         }
        if (gepaltalValasztott==2){
            System.out.println("olló");
         }
        
        if(valasztott.equals("ko") && gepaltalValasztott==0 || valasztott.equals("papir")&& gepaltalValasztott==1 ||
                valasztott.equals("ollo") && gepaltalValasztott==2 ){
            System.out.println("Döntetlen");
        }
        else if(valasztott.equals("ko") && gepaltalValasztott==1 || valasztott.equals("papir") && gepaltalValasztott==2 || 
                valasztott.equals("ollo") && gepaltalValasztott==0){
            System.out.println("Gép nyert");
        }
        else {
          System.out.println("Ön nyert");
        }
       }
    
        
        
    }
}

