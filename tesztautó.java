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
public class tesztautó {
    
    public static void main(String[] args) {
         Autó[] autók = new Autó[]{
            new Autó("ABC123",110),
            new Autó("DEF456",120),
            new Autó("GHI789",340),
            new Autó("JKL123",350),
            new Autó("MNO456",900),
            new Teherautó("PQR789",800,550),
            new Teherautó("STU123",700,650),
            new Teherautó("VWX456",300,250),
            new Teherautó("YZA789",460,255),
            new Teherautó("BCD123",270,230)
    };
         Teherautó[] teherautók = new Teherautó[]{
            new Teherautó("FCK987",999,888),
            new Teherautó("KFC654",777,666),
            new Teherautó("MCD321",555,444),
            new Teherautó("MTZ987",333,222),
            new Teherautó("ZTE654",111,101),
            new Teherautó("SKH321",987,100),
            new Teherautó("SQP987",543,210),
            new Teherautó("COM654",800,700),
            new Teherautó("MUN321",500,400),
            new Teherautó("ISM987",850,900)
         };
            
         
         rendezMaxSzállíthatóTeherCsökkenőleg(teherautók);
        
        for(int i=0;i<teherautók.length;i++){
            
        System.out.println(teherautók[i].getMaxSzállíthatóTeher());
        
        }
        Autó a =keresMaxMotorTeljesítmény(autók);//metódus által visszaadott értéket eltároljuk,hogy ki tudjuk írni
        
        System.out.println("A legnagyobb motorteljesítmény: " + a.getMotorTeljesítmény());
        
        
        
    }
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        for(int i=0; i<teher.length-1; i++){
            for(int j=i+1; j<teher.length; j++){
                if(teher[i].getMaxSzállíthatóTeher()< teher[j].getMaxSzállíthatóTeher()){
                    Teherautó tmp = teher[i];
                    teher[i]=teher[j];
                    teher[j]=tmp;
                }
            }
    } 
    }
    
    public static Autó keresMaxMotorTeljesítmény(Autó[] autó){
        for(int i=0; i<autó.length-1; i++){
            for(int j=i+1; j<autó.length; j++){
                if(autó[i].getMotorTeljesítmény()<autó[j].getMotorTeljesítmény()){
                    Autó tmp = autó[i];
                    autó[i]=autó[j];
                    autó[j]=tmp;
                }
            }
        }
     
     return autó[0];
     
    }
}


