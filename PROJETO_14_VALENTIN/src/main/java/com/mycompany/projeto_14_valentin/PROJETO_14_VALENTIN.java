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
<<<<<<< HEAD
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
        
=======
        int numArray[] = new int [25];
        int x = 0;
        int somaLinha[] = new int [5];
        int somaDiagonalUm[] = new int [5];
        int somaDiagonalDois[] = new int [5];
        int somaUm = 0;
        int somaDois = 0;
        int cUm = 4;
        int cDois = 4;
        String s = "";
        DataInputStream dado;
        
        
        // Recebendo os números 
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){
               dado = new DataInputStream(System.in);            
               System.out.print("Digite o numero: ");
               s = dado.readLine();
               num[l][c] = Integer.parseInt(s);
               
            }        
        }    
        
        // Pritnando os números originais
>>>>>>> 6d36929714000647e1b6891ea758d37e2e028d94
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){            
                System.out.print(num[l][c] + " | ");
            }  
            System.out.println(" ");
        }
        
       System.out.println(" ");
<<<<<<< HEAD
        
=======
       
       // Mudando Matriz para Array
       for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numArray[x++] = num[i][j];
            }
        }
       
       // Ordenando a Array
       Arrays.sort(numArray);
       
       // Mudando Array ordenada para Matriz
       x = 0;
       for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = numArray[x++];
            }
        }
 
       // Printando os núemros ordenados
>>>>>>> 6d36929714000647e1b6891ea758d37e2e028d94
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){            
                System.out.print(num[l][c] + " | ");
            }  
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
<<<<<<< HEAD
=======
        //Somando as linhas
>>>>>>> 6d36929714000647e1b6891ea758d37e2e028d94
        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){            
                somaLinha[l] = somaLinha[l] + num[l][c];
            }  
        }
        
<<<<<<< HEAD
=======
        // Printando as somas das linhas
>>>>>>> 6d36929714000647e1b6891ea758d37e2e028d94
        for(int l = 0; l < 5; l++){            
                System.out.println(" Soma da linha " + (l+1) + ": " + somaLinha[l]);
            }
        
        System.out.println(" ");
        
<<<<<<< HEAD
        for(int l = 0; l < 5; l++){
            for(int c = 4; c >= 0; c--){
                somaDiagonalUm[l] = num[l][c];
            }  
        }
        
=======
        // Somando diagonal 1
        for(int l = 0; l < 5; l++){
            somaDiagonalUm[l] = num[l][cUm];
            cUm--; 
        }
        
        //Somando Diagonal 2
        for(int l = 0; l < 5; l++){
            somaDiagonalDois[l] = num[cDois][l];
            cDois--; 
        }
        
        // Somando diagonal 1
        for(int l = 0; l < 5; l++){
            somaUm = somaUm + somaDiagonalUm[l];
        }
        //Somando Diagonal 2
        for(int l = 0; l < 5; l++){
            somaDois = somaDois + somaDiagonalDois[l];
        }
        
        // Printando as somas das diagonais
        System.out.println(" Soma da diagoal Um " + somaUm);
        System.out.println(" ");
        System.out.println(" Soma da diagoal Dois " + somaDois);
        
        
>>>>>>> 6d36929714000647e1b6891ea758d37e2e028d94
        System.out.println(" ");
    }
}
