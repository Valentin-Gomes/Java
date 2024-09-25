/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_valentin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class PROJETO_15_VALENTIN {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int valorUsuario[] = new int[5];
        String nomeArquivo = " ";
        Date date = new Date();
        
        System.out.println("---TABUADA---");
        System.out.println("Digite uma sequencia de 5 numeros");
        
        for(int l = 0; l < 5; l++){
            System.out.print("\nInforme um valor: ");                
            valorUsuario[l] = sc.nextInt();
            sc.nextLine();
        }
        
        
        
        for(int l = 0; l < 5; l++){
            nomeArquivo = "Tabuada de " + valorUsuario[l];           

            FileWriter arquivo = new FileWriter("\\\\10.145.40.3\\fs-labcetec\\TURMAS\\HTC-DDS-19\\Valentin Gomes\\Programação de Aplicativos\\Teste Arquivo TXT Java\\" + nomeArquivo + ".txt");
            PrintWriter gravar = new PrintWriter(arquivo);

            gravar.printf("Tabuada do " + valorUsuario[l] + " | " + date + "\n");
            gravar.printf("---------------");

            for(int i = 1; i <= 10; i++){
                gravar.printf("\n" + i + " x " + valorUsuario[l] + " = " + (i * valorUsuario[l]));
            }
            gravar.printf("\n---------------");
            arquivo.close();
        }
        
        
        
        
    }
}
