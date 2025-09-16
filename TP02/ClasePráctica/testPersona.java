package TP02.ClasePráctica;
import java.util.Scanner;

public class testPersona {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su dni");
        int dni = scanner.nextInt();

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        Persona persona2;
        persona2 = new Persona(nombre, apellido, edad, dni);

        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());
        System.out.println(persona2.getDni());
        System.out.println(persona2.getEdad());

        if (persona2.mayorDeEdad() == true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
        scanner.close();
    }
}   

