package mayor;

import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in); //Linea para escaner lo que se escribe en consola
        int numero1 ; //primer numero
        int numero2 ; //segundo numero
        
     System.out.println("Dame el primer número"); //Mensaje
     numero1 = reader.nextInt(); // Asigna el valor que escriban a la variable numero1
        
     System.out.println("Dame el segundo número");
     numero2 = reader.nextInt();  // Asigna el valor que escriban a la variable numero2
     
     if(numero1>numero2){//Condicion si el primer numero es mayor al segundo
         System.out.println("El numero mayor es "+numero1); //En caso de cumplir la condicion manda este mensaje
         }
     else{ //si no se cumple la primera condicion se manda este mensaje
              System.out.println("El numero mayor es "+numero2);
         }
     
     // hola
    }
}
