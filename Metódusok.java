
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fannu
 */
public class Metódusok {
    
      public static void main(String[] args) {
//         Novekvoben(7, 11, 8);
//          
//         minabszmax(54,19,36);
//         
//         Sorrendek(55,21,9, 0);
//          
//         Háromszög(9,5,7);
//          
//          System.out.println("Szökőévek száma:" +szokoevek_szama(2022, 1955));
//          
//         Érdemjegyek(4);
//          
//          System.out.println("Hányados: "+Hányados(88, 4)); 
//          
//          System.out.println("Prímszám? "+Primszam_e(11));
//          
//          Fibonacci(0, 1, 6);
//          
//          Forditott_szam(9548);
//          
//          Faktorialis(5); 
          
//          Oszthato(1,10,2); 
          
//         kicsiFibonacci(99);
//                 
//         utolsó();  
      }
      
      
  
  
  public static void Novekvoben(int a, int b, int c){

	if(a < b && a < c && b < c){
            System.out.println("Növekvő sorrendben:"+a+" "+b+" "+c); 
		}
	else if(a < b && a < c && c < b){
            System.out.println("Növekvő sorrendben:"+a+" "+c+" "+b);
	}
	else if(b < a && b< c && a < c){
            System.out.println("Növekvő sorrendben:"+b+" "+a+" "+c );
	}
        else if(b < a && b < c && c < a) {
            System.out.println("Növekvő sorrendben:"+b+" "+c+" "+a);
         }
        else if(c< a && c < b && a < b){
            System.out.println("Növekvő sorrendben:"+c+" "+a+" "+b);
        }
        else{
            System.out.println("Növekvő sorrendben:"+c+" "+b+" "+a);
        } 
  }
  
  public static void minabszmax(int a, int b, int c){
	int min = 0;
	int abszmax = 0;
	
	if(a < b && a < c){
	min = a;
	} 
	else if(b < a && b < c){
	min = b;
	} 
	else{
	min = c;
	} 
	System.out.println("Az értékek minimuma:"+min);
	
	a = Math.abs(a);
	b = Math.abs(b);
	c = Math.abs(c);
	if ( a > b && a > c) {
	abszmax = a;
	}
	else if(b > a && b > c) {
	abszmax = b;
	}
	else{
	abszmax = c;
	}

	System.out.println("Az abszolútértékek maximuma:"+abszmax);
       
       
}
  public static void Sorrendek(int a, int b, int c, int d){
	System.out.println("Adott sorrend:"+a+","+b+","+c+","+d);
        
	if( d >= 0){
	System.out.println("Megváltozott sorrend: "+a+","+c+","+b+","+d);
	}
        else {
	System.out.println("Megváltozott sorrend:" +a+","+b+","+d+","+c);
	}
         
  }

   public static boolean Háromszög(int a, int b, int c){
       
        if (a < c + b && b < c + a && c < b + a) {
            return true;
	}
         else {
            return false;
        }

    }
  public static int szokoevek_szama(int ev1, int ev2){
	int kezdoev =  ev1;
	int zaroev = ev2;
	int sz = 0;
        
	if(ev1 > ev2){
	kezdoev= ev2;
	zaroev = ev1;
	}

	int i;
	for(i=kezdoev; i<=zaroev; i++){
	if((i %4 == 0 && i%100 !=0) || i % 400 ==0){
	sz++;
	}
        
	}
        return sz;
        
	}
 public static void Érdemjegyek(int érdemjegy){
switch(érdemjegy){
	case 5:
	System.out.println("Jeles");
	break;
	case 4:
	System.out.println("Jó");
	break;
	case 3:
	System.out.println("Közepes");
	break;
	case 2:
	System.out.println("Elégséges");
	break;
	case 1:
	System.out.println("Elégtelen");
	break;
        
}
 }
 public static int Hányados(int a, int b) {

         int hányados = 0;
        
        while (a >= b) {
            hányados = hányados + 1;
            a = a-b;
        }
        return hányados;
    }
 
public static boolean Primszam_e(int n){
    int i;
    int osztok_szama=0;
    
    for(i=1;i<=n;i++){
    if(n % i == 0){
    osztok_szama++;
    }
    }
    if(osztok_szama==2){
    return true;
    }
    else{
    return false;
    }
 

    
}
public static void Fibonacci(int a, int b, int n){
    int c;
    int k;
    
  if(n == 1){
   System.out.println(a);
    }
   else if(n==2){
    System.out.println(a+","+b);
    }
   else{
    c = a + b;
    System.out.println(a+","+b+","+c);
    k = 3;
    while(k < n){
     a = b;
     b = c;
     c = a + b;
    System.out.println(c);
    k += 1;
    }
   }
  } 

  public static void Forditott_szam(int n){
int ujszam=0;
while(n!=0){
    ujszam = ujszam*10 + (n%10);
n = n / 10;
}
      System.out.println("Fordítva:"+ujszam);
} 
  
  public static void Faktorialis(int a){
    int fakt = 1;
    int i;
    for(i=1;i<=a;i++){
    fakt*=i;
    }
    System.out.println("A megadott szam faktorialisa:"+fakt);
    
}
  
  public static void Oszthato(int n1,int n2,int k){
        int i;
    for(i=n1;i<=n2;i++){
    if(i % k ==0){
    System.out.println(i);
           }
    
    }
    
  }
  
  public static int kicsiFibonacci(int n){
             int a=0;
           int b=1;
           
        int i=0;
        
        int f=1;
            
            while (f<n){
                
                f=a+b;
                
                b=a;
                a=f;
                f=b;
                
                i++;
        }
            return f;
       
  }
    public static void utolsó() {
        int a;
        for (a = 999; a > 100; --a) {
            int b = a % 10;
            int c = a / 100;
            int d = a / 10 % 10;
            int n = (b * b * b) + (c * c * c) + (d * d * d);

            if (a == n) {
                System.out.println(a);
            }
        }
       
    } 
   
}

 






 