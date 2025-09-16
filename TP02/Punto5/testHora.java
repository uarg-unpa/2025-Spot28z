package TP02.Punto5;
import java.util.Scanner;

public class testHora {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la hora, los minutos y los segundos");
        int hora = scanner.nextInt();
        int minutos= scanner.nextInt();
        int segundos= scanner.nextInt();
        scanner.nextLine();

        Hora primerHora = new Hora(hora, minutos, segundos);
        if(primerHora.validacion(hora, minutos, segundos) == true){
            System.out.println("El horario registrado es válido" + primerHora.formatoHora());
            System.out.println("Equivale a :" +primerHora.convertirEnMinutos() + "minutos");
        }else{
            System.out.println("La hora ingresada no es válida, queda registrado como: " +primerHora.formatoHora());
        }
        System.out.println("Cambia la hora");
        primerHora.setHora(scanner.nextInt());

        System.out.println("Cambia los minutos");
        primerHora.setMinutos(scanner.nextInt());

        System.out.println("Cambia los segundos");
        primerHora.setSegundos(scanner.nextInt());

        System.out.println("La nueva hora es: " +primerHora.formatoHora());

        scanner.close();
    }
}
