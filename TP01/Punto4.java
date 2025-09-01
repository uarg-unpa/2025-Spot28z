package TP01;
public class Punto4 {
    
        public static void main(String[]args){
            int num1=128;
            int num2=420;
            int num3=257;
            if (num1>num2 && num1>num3){
                System.out.println("El número mayor es:"+num1);
            }
            else if (num2>num1 && num2>num3){
                System.out.println("El número mayor es:"+num2);
            }
            else{
                System.out.println("El número mayor es:"+num3);
            }
        }
    }