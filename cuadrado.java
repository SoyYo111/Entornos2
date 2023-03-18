package Practica2;
import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) 
	{
		 Scanner teclado = new Scanner( System.in );
		// TODO Auto-generated method stub
		 int num,cuadrado,okey;
		
		 System.out.print("Introduzca número: ");
		 num=teclado.nextInt();
		 while(num>=0){ 
		 cuadrado=num*num;
		 System.out.println(num+ "² es igual a "+ cuadrado);
		 System.out.print("Introduzca otro número: ");
		 num=teclado.nextInt();
		 } 
		 System.out.print("Fin... ");
		 teclado.close();
	}

}
