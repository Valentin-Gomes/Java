/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_valentin;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;


public class PROJETO_14_VALENTIN {

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int num[][] = new int[5][5];
        int somaLinha[] = new int [5];
        int somaDiagonalUm[] = new int [5];
        int somaDiagonalDois[] = new int [5];
        String s = "";
        DataInputStream dado;
        
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){
               // dado = new DataInputStream(System.in);            
               // System.out.print("Digite o numero: ");
               // s = dado.readLine();
               // num[l][c] = Integer.parseInt(s);
               num[l][c] = rand.nextInt(51);
            }        
        }    
        
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){            
                System.out.print(num[l][c] + " | ");
            }  
            System.out.println(" ");
        }
        
       System.out.println(" ");
        
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){            
                System.out.print(num[l][c] + " | ");
            }  
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){            
                somaLinha[l] = somaLinha[l] + num[l][c];
            }  
        }
        
        for(int l = 0; l < 5; l++){            
                System.out.println(" Soma da linha " + (l+1) + ": " + somaLinha[l]);
            }
        
        System.out.println(" ");
        
        for(int l = 0; l < 5; l++){
            for(int c = 4; c >= 0; c--){
                somaDiagonalUm[l] = num[l][c];
            }  
        }
        
        System.out.println(" ");
    }
}
