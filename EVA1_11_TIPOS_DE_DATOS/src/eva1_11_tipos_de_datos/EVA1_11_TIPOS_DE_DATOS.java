/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_tipos_de_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_TIPOS_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte califa = 127;
        //califa=200;
        califa++;
        
        System.out.println(califa);
        //1 byte =8bits = 2a la 8= 256 = 128+127= 255 +(sign)
        
        /* 
        Scanner input = new Scanner(System.in);
        System.out.println("Sumar valor:");
        byte captu= input.nextByte();
        System.out.println(califa + captu);
        */
        
        
        int valor;
        valor = Integer.MAX_VALUE;
        System.out.println(valor + 1);
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        
        char caracter = 'a';
        char arroba = 64;
        System.out.println(caracter + 0);
        System.out.println(arroba);
        
    }
    
}
