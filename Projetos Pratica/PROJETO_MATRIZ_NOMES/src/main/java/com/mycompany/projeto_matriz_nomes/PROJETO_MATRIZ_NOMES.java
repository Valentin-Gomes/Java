/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_matriz_nomes;


import java.util.Scanner;
public class PROJETO_MATRIZ_NOMES {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        String nome [][] = new String[2][4];
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite seu nome: ");
                nome [i][j] = ler.nextLine();
            }
        } 
               
        for(int i = 0; i < 2; i++){
           
            System.out.print("Linha " + (i+1) + " | ");
            
            for(int j = 0; j < 4; j++){
                System.out.print(nome[i][j] + " | ");
            }
            System.out.println(" ");
        }
        
    }
}
