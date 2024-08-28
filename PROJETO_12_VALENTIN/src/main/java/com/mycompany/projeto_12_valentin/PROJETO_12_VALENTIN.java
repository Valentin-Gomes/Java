/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_valentin;


import java.util.Scanner;

public class PROJETO_12_VALENTIN {   
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo 'Advinhe o filme!' ");
      
        advinharFilme(escolherFilme(), escolherDicas());
    }
    
    public static String escolherFilme(){  
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Jogador 1 - Digite o nome do filme: ");
        String nomeFilme = ler.nextLine();
        
        return nomeFilme;
    }
    
    public static String[] escolherDicas(){
        Scanner ler = new Scanner(System.in);
        String dicas[] = new String[5];
        
        for(int i = 0; i < 5; i++){
        System.out.println("Digite as 5 dicas do filme: ");
        dicas[i] = ler.nextLine();
        }
        return dicas;
    }

    public static void advinharFilme( String nomeFilme, String[] dicas){
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
        System.out.println("Jogador 2 - A dica " + (i+1) + " é " + dicas[i] +", tente advinhar o nome do filme: ");
        String advinharFilme = ler.nextLine();
        
        if(advinharFilme.equals(nomeFilme)){
            System.out.println("Parabéns, acertou!");
            break;
        }
        else{
          System.out.println("Você errou!");
        }
        }
        
        
    }
    
}
