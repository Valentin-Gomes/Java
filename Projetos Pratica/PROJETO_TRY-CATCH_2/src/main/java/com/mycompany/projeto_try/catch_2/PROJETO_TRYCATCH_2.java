/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_try.catch_2;


import java.util.Scanner;

public class PROJETO_TRYCATCH_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        
        System.out.print("Digite o divisor: ");
        int divisor = ler.nextInt();
        
        try {
            int resultado = num / divisor;
            System.out.print("Resultado " + resultado);
        } catch(ArithmeticException e){
            System.out.print("Erro: divisão por Zero");
        }
        
    }
}
