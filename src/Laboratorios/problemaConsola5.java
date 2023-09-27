package Laboratorios;

import java.util.Scanner;

public class problemaConsola5 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner leer = new Scanner(System.in);
		double pre, impcom, impdes, imppag;
		int can, car;
		
		//Entrada de datos
		System.out.println("Tienda de Cibertec ");
		System.out.println("--------------------------------");
		System.out.print("Ingresa el precio del producto : ");
		pre = leer.nextDouble();
		System.out.print("Ingresa la cantidad del producto : ");
		can = leer.nextInt();
		System.out.println(" ");
		
		//Calculos de los importes
		impcom = can*pre;
		impdes = 0.11*impcom;
		imppag = impcom - impdes;
		car = 2*can;
		
		//Salida de datos
		System.out.println("Boleta a pagar ");
		System.out.println("---------------------------------");
		System.out.println("importe de la compra :  " + impcom);
		System.out.println("importe de descuento  : " + impdes);
		System.out.println("importe a pagar       : " + imppag);
		System.out.println("cantidad de caramelos : " + car);
		
		leer.close();

	}

}
