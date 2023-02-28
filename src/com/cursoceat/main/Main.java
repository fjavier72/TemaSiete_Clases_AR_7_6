package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		/* Creo el objeto miHoras para luego por medio de los métodos setter ingresar los valores
		* a la hora, minutos y segundos */
		Horas miHoras = new Horas();
		// A partir de esta línea se solicita la información y se asigna el valor a los atributos
		System.out.print("Indique la hora: ");
		miHoras.setHora(input.nextInt());
		
		System.out.print("Indique los minutos: ");
		miHoras.setMinutos(input.nextInt());
		
		System.out.print("Indique los segundos: ");
		miHoras.setSegundos(input.nextInt());
		
		System.out.println("¿Cuántos segundos quiere mostrar?");
		int numSegundos = input.nextInt();
		
		for (int i = 0; i <= numSegundos; i++) {
			System.out.printf("%02d:%02d:%02d\n", miHoras.getHora(), miHoras.getMinutos(), miHoras.getSegundos());
			miHoras.incrementarSegundos();  // Incrementamos la hora actual en un segundo
		}
		
		input.close();
	}

}
