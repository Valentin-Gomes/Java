/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_valentin;

import java.util.Scanner;
public class PROJETO_7_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float imc;
        
        System.out.print("Digite seu peso( em Kg): ");
        
        int peso = ler.nextInt();
        
        System.out.print("Digite sua altura( em metros): ");
        
        float altura = ler.nextFloat();
        
        imc = (peso/(altura*altura));
        
        System.out.println("IMC " +imc);
        
        if (imc <= 18.5){
            System.out.println("Abaixo do peso normal");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }
        else if (imc >=25 && imc <=29.9){
            System.out.println("Excesso de peso");
        }
        else if (imc >= 30 && imc <=34.9){
            System.out.println("Obesidade Classe 1");
        }
        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade classe II");
        }
        else{
            System.out.println("Obesidade classe III");
        }
        
    }
}
