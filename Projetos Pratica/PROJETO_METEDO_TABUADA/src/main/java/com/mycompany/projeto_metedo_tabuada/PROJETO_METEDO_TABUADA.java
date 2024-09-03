/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_metedo_tabuada;


import java.util.Scanner;

public class PROJETO_METEDO_TABUADA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número para fazer a tabuada: ");
        int num = ler.nextInt();
        
        tabuada(num);
        
    
    }
    
    public static void tabuada(int num){
        int resultado[] = new int[10];
        
        for(int i = 0; i < 10; i++){
            resultado[i] = num * (i+1);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(num + " * " + (i+1) + " = " + resultado[i]);
        }
        
    }
}
