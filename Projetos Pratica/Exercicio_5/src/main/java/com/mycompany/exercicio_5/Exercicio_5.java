/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_5;

import java.io.DataInputStream;
import java.io.IOException;

public class Exercicio_5 {

    public static void main(String[] args) throws IOException {
        int num[] = new int[10];
        String s = "";
        int soma = 0;
        float media = 0;
        DataInputStream dado;
        
        for(int c = 0; c < num.length; c++){
            dado = new DataInputStream(System.in);            
            System.out.print("Digite o " + (c+1) + "º numero: ");
            s = dado.readLine();
            num[c] = Integer.parseInt(s);
        }
        
        for(int c = 0; c < num.length; c++){
                soma = soma + num[c];                            
        }
        media = soma;
        media = media/num.length;
        System.out.println("Media foi de " + media);
        
        for(int c = 0; c < num.length; c++){
            if(num[c] > media){
                System.out.println(num[c] + " e maior que a media");
            }
        }
        
    }
}
