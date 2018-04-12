/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto172;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class AceptaElReto172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        num = sc.nextInt();
        while (num !=0){
            
            boolean I = false;
            boolean D = false;
            
           
            String pers = sc.nextLine();
            for (int a=0; a<pers.length(); a++){
                if(pers.charAt(a)=='I'){
                    I=true;
                }
                else if(pers.charAt(a)=='D'){
                    D=true;
                }
            }
            
            if(I&&D){
                System.out.println("ALGUNO NO COME");
            }
            else{
                System.out.println("TODOS COMEN");
            }
               num = sc.nextInt();
            
    }

}   
        
        
        
}         
    
    

