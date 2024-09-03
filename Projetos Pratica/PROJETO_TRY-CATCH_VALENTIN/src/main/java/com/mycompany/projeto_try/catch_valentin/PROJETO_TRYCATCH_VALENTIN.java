/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_try.catch_valentin;

/**
 *
 * @author v.gomes
 */
public class PROJETO_TRYCATCH_VALENTIN {

    public static void main(String[] args) {
        String valorString = "4.2";
        
        try {
            int valorInteiro = Integer.parseInt(valorString);
            System.out.println("Valor ineiro: " + valorInteiro);           
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter: " + e.getMessage());
        }
        
    }
}
