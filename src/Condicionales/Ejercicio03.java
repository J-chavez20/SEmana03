
package Condicionales;
import java.util.Scanner;
public class Ejercicio03 {
     public static void main(String[] args) {
Scanner lectura = new Scanner(System.in);
// Solicitar la edad al usuario
        System.out.print("Ingrese la edad: ");
    int edad = lectura.nextInt();
// Condición múltiple con varios if
    if (edad >= 0 && edad <= 12) {
        System.out.println("Etapa: Niño.");
    }
    if (edad >= 13 && edad <= 17) {
        System.out.println("Etapa: Adolescente.");
    }
    if (edad >= 18 && edad <= 64) {
        System.out.println("Etapa: Adulto.");
    }
       if (edad >= 65) {
        System.out.println("Etapa: Adulto Mayor.");
    }
    if (edad < 0) {
        System.out.println("Edad no válida.");
    }

        lectura.close();
     }
}
