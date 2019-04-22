/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prasistensiweek1;
import java.util.Scanner;
/**
 *
 * @author Admiral Litik
 */
public class BilanganPolinomial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
          System.out.print(" Masukkan tiga bilangan        : ");
          int a = input.nextInt(); 
          int b = input.nextInt(); 
          int c = input.nextInt();
          
          if (a ==0){
              System.out.println("Nilai bilangan pertama tidak boleh 0");
           }else{
          if(a >0 && b > 0 && c > 0){System.out.println(" Polinomial "+a+"x² +"+b+"x +"+c+" mempunyai");}
          else if(a>0 && b>0 && c<0){System.out.println(" Polinomial "+a+"x² +"+b+"x "+c+" mempunyai");}
          else if(a>0 && b<0 && c>0){System.out.println(" Polinomial "+a+"x² "+b+"x +"+c+" mempunyai");}
          else if(a<0 && b>0 && c>0){System.out.println(" Polinomial "+a+"x² +"+b+"x +"+c+" mempunyai");}
          else if(a>0 && b<0 && c<0){System.out.println(" Polinomial "+a+"x² "+b+"x "+c+" mempunyai");}
          else if(a<0 && b>0 && c<0){System.out.println(" Polinomial "+a+"x² +"+b+"x "+c+" mempunyai");}
          else if(a<0 && b<0 && c>0){System.out.println(" Polinomial "+a+"x² "+b+"x +"+c+" mempunyai");}
          else{System.out.println(" Polinomial "+a+"x² "+b+"x "+c+" mempunyai");}
          }
          
          double d = (b*b) - (4*a*c);
          System.out.println("a. Diskriminan                : "+d);
          if (d>0){
          double e = (-1*b + Math.sqrt(d))/(2*a);
          double f = (-1*b - Math.sqrt(d))/(2*a);
          System.out.println("b. Akar-akar dari polinomial  : "+e+" dan "+f);
          }else{
              double g = (-1*b)/2;
              double dd = (-1*d);
              double ddd = Math.sqrt(dd)/2;
              double temp = Math.pow(10, 3);
              double dddd = (double) Math.round(ddd*temp)/temp;
              double h; h = (g + dddd);
              double k; k = (g - dddd);
          System.out.println("b. Akar-akar dari polinomial  : "+h+" dan "+k+"");
          }
          
          double r = -1*b;
          double t = -1*d;
          double x = r/(2*a);
          double y = t/(4*a);
          System.out.println("c. Titik stasioner            : ("+x+","+y+")");
          if(a>0){System.out.println("d. Arah cekung kurva          : ke atas ");}
          else{System.out.println("d. Arah cekung kurva          : ke bawah");}
          System.out.println("e. Nilai minimum lokal        : "+y);
              
          
          
    }
    
}
        
        
        
    
    

