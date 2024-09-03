/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_pratica_array;


import java.util.Scanner;

public class PROJETO_PRATICA_ARRAY {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = 5; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor "v"
        int i; // índice
        
        for(i = 0; i < n; i++ ){
            System.out.printf("Informe %do. elemento de %d: ", (i+1), n);
            v[i] = ler.nextInt();
        }
        
        System.out.printf("\n");
        
        for(i = 0; i < n; i++ ){
            System.out.printf("v[%d] = %d\n", i, v[i]);
        }
        
    }
}
