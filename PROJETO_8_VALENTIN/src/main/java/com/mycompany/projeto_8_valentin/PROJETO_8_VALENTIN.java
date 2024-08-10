/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_valentin;

import java.util.Scanner;
public class PROJETO_8_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o número de medalhas de ouro: ");
        int ouro = ler.nextInt();
        
        System.out.print("Digite o número de medalhas de prata: ");
        int prata = ler.nextInt();
        
        System.out.print("Digite o número de medalhas de bronze: ");
        int bronze = ler.nextInt();
        
        int total = ouro + prata + bronze;
        
        if (ouro > 5 && total > 30){
            System.out.println("Desempenho extraordinário!");
        }
        
        else if (ouro > 10){
            System.out.println("Ótimo desempenho");
        }
        
        else if (ouro > 5 && ouro < 10){
            System.out.println("Bom desempenho");
        }
        else if (ouro < 5 && total >20){
            System.out.println("Desempenho regular");
        }
        else if (total  <=20){
            System.out.println("Desempenho fraco");
    }
        
       
        
        
        
        
        
    }
}
