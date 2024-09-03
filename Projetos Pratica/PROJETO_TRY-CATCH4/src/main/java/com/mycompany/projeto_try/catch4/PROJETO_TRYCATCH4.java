/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_try.catch4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PROJETO_TRYCATCH4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num[] = new int[4];
        float divisaoUm;
        float divisaoDois;
        
        try{
            for(int c = 0; c < 4; c++){
            System.out.print("Digite 4 valores: ");
            num[c] = ler.nextInt();
            }
        } catch (InputMismatchException e1){
            System.out.println("Erro: " + e1.getMessage());
        }
        
        try {
            divisaoUm = num[0]/num[1];
            System.out.println("Valor da divisao " + divisaoUm);
        } catch (ArithmeticException e2){
            System.out.println("Erro: divisão por Zero");
        }
        
        try {
            divisaoDois = num[2]/num[3];
            System.out.println("Valor da divisao " + divisaoDois);
        } catch (ArithmeticException e3){
            System.out.println("Erro: divisão por Zero");
        }
    }
}
