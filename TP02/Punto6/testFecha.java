package TP02.Punto6;
import java.util.Scanner;

public class testFecha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Fecha fecha1= new Fecha(6, 2, 2025);

        System.out.println(fecha1.devolverFecha());

        System.out.println("Cambie el día");
        int dia= scanner.nextInt();

        System.out.println("Cambie el mes");
        int mes= scanner.nextInt();
        
        System.out.println("Cambie el año");
        int año= scanner.nextInt();

        fecha1.setDia(dia);
        fecha1.setMes(mes);
        fecha1.setAño(año);

        fecha1.meses(mes);

        //punto 7
        System.out.println("Ingrese una nueva fecha");
        
        System.out.println("Dia: ");
        dia= scanner.nextInt();

        System.out.println("Mes: ");
        mes= scanner.nextInt();

        System.out.println("Año: ");
        año= scanner.nextInt();

        Fecha fecha2= new Fecha(mes, dia, año);
        fecha2.meses(mes);

        if (fecha1.fechaMayor(fecha1.getAño(), fecha2.getAño())){
            System.out.println("La fecha mayor es: " + fecha1.devolverFecha());
        }else{
            System.out.println("La fecha mayor es: " + fecha2.devolverFecha());
        }

        scanner.close();
    }    
}
