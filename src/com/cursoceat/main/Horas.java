package com.cursoceat.main;

public class Horas {

	// Atributos
	private int hora, minutos, segundos;

	// Getter y Setter
	public int getHora() {  // Nos permite mostrar lo que tiene almacenado hora
		return hora;
	}

	public void setHora(int hora) {  // Nos permite asignarle un valor al atributo hora
		if (hora >= 0 && hora <= 23)  // Estamos controlando que la hora esté entre 0 y 23 hrs
			this.hora = hora;
		else 
			this.hora = 0;
	}

	public int getMinutos() {  // Muestra los minutos
		return minutos;
	}

	public void setMinutos(int minutos) {  // Nos permite asignarle un valor al atributo minutos
		if (minutos >= 0 && minutos <= 59)
			this.minutos = minutos;
		else 
			this.minutos = 0;
	}

	public int getSegundos() {  // Muestra los segundos
		return segundos;
	}

	public void setSegundos(int segundos) {  // Nos permite asignarle un valor al atributo segundos
		if (segundos >= 0 && segundos <= 59)
			this.segundos = segundos;
		else 
			this.segundos = 0;
	}
	
	public void incrementarSegundos() {
		this.segundos++;
		if (this.segundos == 60) {
			this.segundos = 0;
			this.minutos++;
			if (this.minutos == 60) {
				this.minutos = 0;
				this.hora++;
				if (this.hora == 24)
					this.hora = 0;
			}
		}
	}  // Cierra incrementarSegundos

}  // Cierra la Clase
