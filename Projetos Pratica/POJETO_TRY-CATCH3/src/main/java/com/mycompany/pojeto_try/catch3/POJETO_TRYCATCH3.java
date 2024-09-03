/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pojeto_try.catch3;


import java.util.Scanner;

public class POJETO_TRYCATCH3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num[] = {10,20,30,40,50};
        
        System.out.print("Digite um indice: ");
        int indice = ler.nextInt();
        
        try{
            System.out.print("Valor no indice" + indice + " " + num[indice]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Erro: Indice fora do intervalo");
        }
    }
}
