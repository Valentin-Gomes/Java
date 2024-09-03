/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_nome;


import java.util.Scanner;

public class PROJETO_NOME {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        String nome [] = new String[10];
        
        for(int i = 0; i < 10; i++){
            
            System.out.print("Digite seu nome: ");
            nome [i] = ler.nextLine();
        }
        
        
        imprimirNomes(nome);
    }      
    
    public static void imprimirNomes(String nome[]){       
        
        for(int i = 0; i < 10; i++){            
            System.out.print(nome[i] + " | ");
            }
            System.out.println(" ");
    }
    
}
