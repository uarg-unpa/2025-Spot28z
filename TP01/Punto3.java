package TP01;
public class Punto3 {
    
    public static void main (String[]args){
    
        int A=5;
        int B=3;
        int C=7;
        int AUX=C;
            if (A!=B && A!=C){
                B=A;
                C=A;
                A=AUX;
            }
            System.out.println("El valor de A es de:"+A);
            System.out.println("El valor de B es de:"+B);
            System.out.println("El valor de C es de:"+C);
    }
}