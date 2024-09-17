/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_4;

import java.io.DataInputStream;
import java.io.IOException;

public class Exercicio_4 {

    public static void main(String[] args) throws IOException {
        int num[] = new int[8];
        String s = "";
        int negativo = 0;
        DataInputStream dado;
        
        for(int c = 0; c < num.length; c++){
            dado = new DataInputStream(System.in);            
            System.out.print("Digite o " + (c+1) + "º numero: ");
            s = dado.readLine();
            num[c] = Integer.parseInt(s);
        }
        
        for(int c = 0; c < num.length; c++){
            if(num[c] < 0){
                negativo++;
            }      
        }
        System.out.print(negativo + " negativo(s)");
    }
}
