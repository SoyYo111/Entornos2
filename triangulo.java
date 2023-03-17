package Practica2;

import java.util.*;

class Triangulo{
    public static void main(String [] args){
         
        double base, altura, resultado;     
        Scanner teclado = new Scanner(System.in);
         
        System.out.print("Ingrese base:\t");
        base = teclado.nextFloat();
         
        System.out.print("Ingrese altura:\t");
        altura = teclado.nextFloat();
         
        resultado = ((base*altura)/2);
         
        System.out.print("El area del Triangulo es:\t"+resultado);
        teclado.close();
    }
}
