package TP01;
import java.util.Scanner;

public class Punto6b {

    public static void main(String[] args) {
    int PRODUCTO = 1;
    int SUMA = 0;
    int CONT = 1;   
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese tres valores");
    while (CONT<=3){
        int NUM =scanner.nextInt();
        SUMA = SUMA + NUM;
        PRODUCTO = PRODUCTO * NUM;
        CONT = CONT + 1;
    }
    System.out.println("Suma de enteros:"+SUMA);
    System.out.println("Producto de enteros:"+PRODUCTO);
    scanner.close();
}
}
