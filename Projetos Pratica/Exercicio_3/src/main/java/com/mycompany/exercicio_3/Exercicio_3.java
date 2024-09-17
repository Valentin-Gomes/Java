/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3;

import java.io.DataInputStream;
import java.io.IOException;

public class Exercicio_3 {

    public static void main(String[] args) throws IOException {
        int num[] = new int[7];
        String s = "";
        int soma = 0;
        float media = 0;
        int divisor = 0;
        DataInputStream dado;
        
        for(int c = 0; c < num.length; c++){
            dado = new DataInputStream(System.in);            
            System.out.print("Digite o " + (c+1) + "º numero: ");
            s = dado.readLine();
            num[c] = Integer.parseInt(s);
        }
        
        for(int c = 0; c < num.length; c++){
            if(num[c] % 3 == 0){
                soma = soma + num[c];
                divisor++;
            }                            
        }
        media = soma;
        media = media/divisor;
        System.out.print(media);
    }
}
