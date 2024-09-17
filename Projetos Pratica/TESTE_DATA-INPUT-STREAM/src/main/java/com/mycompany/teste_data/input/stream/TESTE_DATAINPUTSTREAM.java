/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste_data.input.stream;

import java.io.DataInputStream;
import java.io.IOException;


public class TESTE_DATAINPUTSTREAM {

    public static void main(String[] args) throws IOException {
        String s ="";
        
        float notas[] = new float[4]; 
        float media = 0;
        DataInputStream dado;
        
        for(int i = 0; i < notas.length; i++){
 
            System.out.println("Entre com a nota " + (i+1) + ": ");
            dado = new DataInputStream(System.in);

            s = dado.readLine();
            notas[i] = Float.parseFloat(s);  
        }
                
        for(int i = 0; i < notas.length; i++){
 
            media = media + notas[i];
        }
        
        media = media/notas.length;
        System.out.println("Media " + media); 
        
    }
}
