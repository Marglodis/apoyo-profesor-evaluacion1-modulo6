package com.ejercicio1.main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Profesor {
	private ICalculadora calculadora;

	public void mostrarAlumnosPromedio() {
		System.out.println(calculadora.calcularPromedios());
	}
}
