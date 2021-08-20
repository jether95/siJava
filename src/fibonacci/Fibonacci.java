/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author Joaquin Trejos
 */
public class Fibonacci {

    /**
     * version 1.0
     * @param args the command line arguments
     * 
     * 19/08/2021
     * 
     * 
     */
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos numeros desea generar: "));
        int fibonacci = 0;
        int iterador1 = 1;
        int iterador2;
        
        for (int i = 0; i < tamaño; i++) {
            iterador2 = fibonacci;
            fibonacci = iterador1 + fibonacci;
            iterador1 = iterador2;
            System.out.println(iterador1);
        }
        
        System.out.println(iterador1 +" es primo: "+esPrimo(iterador1));
        
    }
    
    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        int contador = 0;

        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }

        return contador < 1;
    }
    
}
