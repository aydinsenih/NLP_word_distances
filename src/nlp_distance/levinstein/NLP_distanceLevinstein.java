/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlp_distance.levinstein;

import java.util.Scanner;

/**
 *
 * @author NOTEBOOK
 */
public class NLP_distanceLevinstein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        while(true){
            
            String kelime1,kelime2;
            System.out.println("enter 1. word");
            kelime1=oku.nextLine();
            System.out.println("enter 2. word");
            kelime2=oku.nextLine();
            System.out.println("Hamming distance : "+distance.hamming(kelime1, kelime2));
            System.out.println("Edit Distance : "+distance.editdistance(kelime1, kelime2));
            System.out.println("Levinstein : "+distance.levinstein(kelime1, kelime2, kelime1.length(), kelime2.length()));
            System.out.println("write 0 to exit or any key to continue.");
            String exit = oku.nextLine();
            if(exit.equals("0")){
                break;
            }

            
        }
        oku.close();
        
        
    }
    
}
