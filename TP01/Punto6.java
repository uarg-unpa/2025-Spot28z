package TP01;
import java.util.Scanner;

public class Punto6 {

           public static void main(String[] args){
            int num1;
            int num2;
            int num3;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese tres valores");
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            num3=scanner.nextInt();
            int suma=num1+num2+num3;
            int producto=num1*num2*num3;
            System.out.println("Suma de enteros:"+suma);
            System.out.println("Producto de enteros:"+producto);
            scanner.close();
        }            
    }

        

