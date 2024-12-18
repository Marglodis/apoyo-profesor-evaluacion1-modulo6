package com.ejercicio1.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CalculadoraSinMaxMinNotas implements ICalculadora {

	private List<Alumno> alumnos;
	
	@Override
	public List<Alumno> calcularPromedios() {
		for (Alumno alumno : alumnos) {
            List<Integer> notas = new ArrayList<>(alumno.getNotas());
            if (notas.size() > 2) {
                Collections.sort(notas);
                notas.remove(0); // Eliminar la nota más baja
                notas.remove(notas.size() - 1); // Eliminar la nota más alta
            }
            float suma = 0;
            for (int nota : notas) {
                suma += nota;
            }
            alumno.setPromedio(notas.size() > 0 ? suma / notas.size() : 0f);
        }
        return alumnos;
    }

}
