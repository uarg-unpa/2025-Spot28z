package TP02.Punto4;
import java.util.Scanner;

public class testTelevisor {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        Televisor tele1;
        tele1 = new Televisor("Samsung", "4K", "Apagado", 10, 250);

        boolean cond= true;
        do{
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1 Informacion de tv \n2 Encender televisión \n3 Cambio de volúmen \n4 Cambio de canal \n5 Apagar \n");
            int opcion= scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(tele1.getInformacion());
                    break;
                case 2:
                    if (tele1.getEstado()== "Apagado"){
                        tele1.setEstado("Encendido");
                        System.out.println("El televisor se ha encedido");
                    }else{
                        System.out.println("El televisor ya se encuentra encendido");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nivel de volúmen");
                    int nivel= scanner.nextInt();
                    tele1.modificadorVolumen(nivel);
                    System.out.println("Nivel de volumen: " + tele1.getVolumen());
                    break;

                case 4:
                    System.out.println("Qué canal quiere cambiar");
                    int canal= scanner.nextInt();
                    tele1.modificadorCanal(canal);
                    System.out.println("Se cambió al canal: " + tele1.getCanal());
                    System.out.println("¿Regresar al canal anterior?\n 1 Si\n 2 No");
                    int volver= scanner.nextInt();
                    if (volver == 1){
                        tele1.canalAnterior(volver);
                        System.out.println("Se regresa al canal: " + tele1.getCanal());
                    }
                    break;

                case 5:
                    System.out.println("Apagando Televisor");
                    cond= false;
                    break;

                default:
                    System.out.println("El valor ingresado no es válido");
                    break;
            }
        }while(cond == true);
        scanner.close();
    }
}
