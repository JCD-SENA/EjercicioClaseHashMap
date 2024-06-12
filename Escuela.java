package juan.ejercicioshashmap;

import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Map;

/*
Haga un sistema que permita solicitar el nombre y la edad de n estudiantes, e imprima:
- Nombre de todos los estudiantes registrados
- Lista de todos los estudiantes con sus edades
- Suma de todas las edades
- Promedio de edades de estudiantes.
- Indique cuantos estudiantes son mayores de 18 años mostrando el nombre y edad
- Permita consultar un estudiante por nombre
*/

public class Escuela {
    HashMap<String, Integer> estudiantes;
    
    public Escuela () {
        estudiantes = new HashMap<String, Integer>();
    }
    
    public void registrarEstudiantes () {
        String nombre = " ";
        int edad = 0;
        boolean ejecutando = true;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            if (nombre.length() > 0) {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del estudiante "+nombre));
                registrarEstudiante(nombre, edad);
            } else {
                ejecutando = false;
            }
        } while (ejecutando);
    }
    
    public void registrarEstudiante(String nombre, int edad) {
        if (!estudiantes.containsKey(nombre)) {
            estudiantes.put(nombre, edad);
        }
    }
    
    public void consultarEstudiante (String nombre) {
        System.out.println(nombre+ " tiene "+estudiantes.get(nombre)+" años");
    }
    
    public int sumaEdades() {
        int res = 0;
        for (Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            res+=estudiante.getValue();
        }
        return res;
    }
    
    public float promedioEdades () {
        float res = 0;
        for (Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            res+=estudiante.getValue();
        }
        return res / estudiantes.size();
    }
    
    public void imprimirEstudiantes () {
        for (Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            consultarEstudiante(estudiante.getKey());
        }
    }
    
    public void mostrarMayores () {
        for (Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            if (estudiante.getValue() >= 18)
                consultarEstudiante(estudiante.getKey());
        }
    }
}
