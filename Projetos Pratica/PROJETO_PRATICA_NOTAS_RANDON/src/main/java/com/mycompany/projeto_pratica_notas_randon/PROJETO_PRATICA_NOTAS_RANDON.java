/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_pratica_notas_randon;

/**
 *
 * @author v.gomes
 */
public class PROJETO_PRATICA_NOTAS_RANDON {

    public static void main(String[] args) {
        int n = 150;
        int vetor[] = new int[n];
        
        for(int i = 0; i < n; i++){
            vetor[i] = (int)(Math.random()*10);
        }
        
        int soma = 0;
        double media;
        
        for(int i = 0; i < n; i++){
            soma = soma + vetor[i];
        }
       
        media = soma/150.0;
        
        for(int i = 0; i < n; i++){
            System.out.println("Vetor [" + i + "] = " + vetor[i]);
            
            System.out.println("-----------------");
            System.out.println("Soma = " + soma);
            
            
        }
        System.out.println("-----------------");
        System.out.println("Média = " + media);
        
    }
}
