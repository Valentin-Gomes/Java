/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_valentin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PROJETO_13_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        int valores[] = new int[qtdNumeros()];
        
        int escolhaUm;
        int escolhaDois;
        
        float resultados[];
        int cancelar = 1;         
        
        try{
            for(int c = 0; c < valores.length; c++){
            System.out.print("Digite os numeros:  ");
            valores[c] = ler.nextInt();
            }
        } catch (InputMismatchException e2){
            System.out.println("Erro: " + e2.getMessage());
        }
        
        do {
            for(int c = 0; c < valores.length; c++){
            System.out.print("Indice: " + c + " - " + valores[c] + " | ");
            }
            
            System.out.println(" ");
            System.out.print("Escolha 02 dos indices acima para realizar a operaçao: ");
            escolhaUm = ler.nextInt();
            escolhaDois = ler.nextInt();
            
            System.out.print("Agora escolha a operaçao (1 - Adiçao, 2 - Subtracao, 3 - Multiplicaçao, 4 - Divisao): ");
            int operacao = ler.nextInt();
            
            System.out.print("Deseja cancelar as operaçoes? (Digite qualquer numero diferente de 1)");
            cancelar = ler.nextInt();
        } while (cancelar == 1);
        
    }
    
    public static int qtdNumeros(){
        Scanner ler = new Scanner(System.in);
       
            System.out.print("Digite a quantidade de numeros a serem operados: ");
            final int x = ler.nextInt();
        
        return x;
    }
    
}
