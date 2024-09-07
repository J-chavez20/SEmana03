
package Condicionales;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
  int numero = lectura.nextInt();
  if (numero > 0) {
        System.out.println("El número es positivo.");
  } else {
        System.out.println("El número no es positivo.");
  }
  lectura.close(); 
    }
}
