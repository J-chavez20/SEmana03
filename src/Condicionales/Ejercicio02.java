
package Condicionales;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la calificación del estudiante (0-20) :");
    int calificacion = lectura.nextInt();

    if (calificacion >= 17) {
        System.out.println("Rendimiento: Excelente.");
    } else if (calificacion >= 12) {
        System.out.println("Rendimiento: Bueno.");
    } else {
        System.out.println("Rendimiento: Necesita mejorar.");
    }

        lectura.close();
    }
}
