package com.ejercicio1.main;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalculadoraSinNotasMenoresATres implements ICalculadora {

	private List<Alumno> alumnos;
	
	@Override
	public List<Alumno> calcularPromedios() {
		
		for(Alumno alumno : alumnos) {
			float sumaNotas = 0F;
			int cantidadNotas = 0;

			for(Integer nota : alumno.getNotas()) {
				if(nota >= 3) {
					sumaNotas += nota;
					cantidadNotas++;	
				}	
		
			}
			alumno.setPromedio(cantidadNotas>0 ? sumaNotas/cantidadNotas : 0f);
			
		}

		return alumnos;
	}

}
