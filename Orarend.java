/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhw.Iskola;

/**
 *
 * @author Fannu
 */
public class Orarend {
     private String nap;
    private Ora[] orak;
    private int szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo=0;
        this.orak = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOrak() {
        return orak;
    }


    public int getSzamlalo() {
        return szamlalo;
    }

    

    @Override
    public String toString() {
        return "Nap: " + nap + ", Órák: " + orak + ", Órák száma: " + szamlalo;
    }
    
  public boolean oratHozzaad(Ora ora){
      if(szamlalo==12){
          return false;
      }
      int kezdodik = ora.getKezdet();
      for(int i=0;i<orak.length;i++){
          if(orak[i]!= null && orak[i].getKezdet()==kezdodik){
              return false;
          }
      }
      orak[szamlalo]=ora;
      szamlalo++;
      
      return true;
        
  }
}
