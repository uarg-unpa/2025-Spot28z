package TP01;
import java.util.Scanner;

public class Punto5 {
    char letra;
    public static void main (String []args){
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese una letra");
    char letra = scanner.next().charAt(0);
    
    if (letra !='L' && letra !='M' && letra != 'I' && letra != 'J' && letra !='V' && letra !='S' && letra !='D'){
        System.out.println("La letra ingresada no es válida");
    }
    switch (letra){
    
        case 'L':
        {
            System.out.println("Hoy no curso Programación de algoritmos");
        break;
        }
        case 'M':
        {
            System.out.println("Hoy tengo clases de Programación de algoritmos");
        break;
        }
        case 'I':
        {
            System.out.println("Hoy tengo clases de Programación de algoritmos");
        break;
        }
        case 'J':
        {
            System.out.println("Hoy tengo clases de Programación de algoritmos");
        break;
        }
        case 'V':
        {
            System.out.println("Hoy no curso Programación de algoritmos");
        break;
        }
         case 'S':
        {
            System.out.println("Hoy no curso Programación de algoritmos");
        break;
        }
        case 'D':
        {
            System.out.println("Hoy no curso Programación de algoritmos");
        break;
        }
}
scanner.close();
}
}