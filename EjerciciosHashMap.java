package juan.ejercicioshashmap;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class EjerciciosHashMap {
    public static void main(String[] args) {
        Escuela es = new Escuela();
        es.registrarEstudiantes();
        int opt = 0;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog("1. Sumar edades\n2. Consultar promedio\n3. Mostrar estudiantes mayores\n4. listar esudiantes\n5. Consultar estudiante por nombre\n6. Salir"));
            switch (opt) {
                case 1:
                    System.out.println("Suma de edades: "+es.sumaEdades());
                    break;
                case 2:
                    System.out.println("Promedio edades: "+es.promedioEdades());
                    break;
                case 3:
                    es.mostrarMayores();
                    break;
                case 4:
                    es.imprimirEstudiantes();
                    break;
                case 5:
                    es.consultarEstudiante(JOptionPane.showInputDialog("Ingrese el nombre del estudiante"));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida");
            }
        } while (opt != 6);
    }
}
