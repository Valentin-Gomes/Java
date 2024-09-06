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
        
        int escolhaUm = 0;
        int escolhaDois = 0;
        int operacao = 0;
        
        int y = 0;
        float resultados[] = new float [valores.length];
        int cancelar = 1;     
        
        
        try{
            for(int c = 0; c < valores.length; c++){
                System.out.print("Digite os numeros:  ");
                valores[c] = ler.nextInt();
            }
        } catch (InputMismatchException e2){
            System.out.println("Erro: Apenas numeros inteiros");
        }
        
        do {
            for(int c = 0; c < valores.length; c++){
                System.out.print("Indice: " + c + " - " + valores[c] + " | ");
            }
            
            System.out.println(" ");
            System.out.print("Escolha 02 dos indices acima para realizar a operaçao: ");
            
            try{
                escolhaUm = ler.nextInt();           
                escolhaDois = ler.nextInt();
            } catch (InputMismatchException e3){
                System.out.println("Erro: Indice fora dos limites do vetor");
            }
            
            try{
                System.out.print("Agora escolha a operaçao (1 - Adiçao, 2 - Subtracao, 3 - Multiplicaçao, 4 - Divisao): ");
                operacao = ler.nextInt();
            } catch (InputMismatchException e4){
                System.out.println("Erro: Apenas numeros inteiros de 1 a 4");
            }
            
            switch (operacao){
                case (1):
                    resultados[y] = valores[escolhaUm] - valores[escolhaDois];
                    System.out.println("Resultado: "+ resultados[y]);
                    y++;
                break;
                
                case (2):
                    resultados[y] = valores[escolhaUm] - valores[escolhaDois];
                    System.out.println("Resultado: "+ resultados[y]);
                    y++;
                break;
                
                case (3):
                    resultados[y] = valores[escolhaUm] - valores[escolhaDois];
                    System.out.println("Resultado: "+ resultados[y]);
                    y++;
                break;
                
                case (4):
                try{
                    resultados[y] = valores[escolhaUm] - valores[escolhaDois];
                    System.out.println("Resultado: "+ resultados[y]);
                    y++;
                  } catch (ArithmeticException e5){
                    System.out.println("Erro: Divisao por Zero");
                  }
                break;
                
                default:
                    System.out.println("Operacao invalida, apenas numeros de 1 a 4");
            }
  
            try{
                System.out.print("Deseja cancelar as operaçoes? (Digite 1 para continuar ou qualquer numero diferente de 1 para cancelar)");
                cancelar = ler.nextInt();
            } catch(InputMismatchException e6){
                System.out.println("Erro: Apenas numeros inteiros");
            }
        } while (cancelar == 1);
        
    }
    
    public static int qtdNumeros(){
        Scanner ler = new Scanner(System.in);
            int x = 0;
            try {
                System.out.print("Digite a quantidade de numeros a serem operados: ");
                x = ler.nextInt();
            } catch (InputMismatchException e1){
            System.out.println("Erro: Apenas numeros inteiros");
        }  
        return x;
    }
    
}
