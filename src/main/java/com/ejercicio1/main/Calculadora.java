package com.ejercicio1.main;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculadora implements ICalculadora{

	List<Alumno> alumnos;

	@Override
	public List<Alumno> calcularPromedios() {

		int indice = 0;
		for(Alumno alumno : alumnos) {
			float sumaNotas = 0F;
			int cantidadNotas = 0;

			for(Integer nota : alumno.getNotas()) {
				sumaNotas += nota;
				cantidadNotas++;
			}
			alumno.setPromedio(sumaNotas/cantidadNotas);
			alumnos.set(indice, alumno);
		}

		return alumnos;
	}

}
