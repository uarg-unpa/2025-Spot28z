import java.util.Scanner;

public class testNave {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        Nave nave1= new Nave("Julio", 500, 10, 1000);

        System.out.println("¿A dónde quiere viajar la nave?");
        String destino= scanner.nextLine();
        System.out.println("¿A cuánta distancia queda?");
        double km= scanner.nextDouble();

        double gasto = nave1.calculoCombustible(km);
        if (nave1.esMayor(km) == true){
            nave1.setCombustible(gasto);
            System.out.println("El combustible restante sería: " +nave1.getcombustible());
            System.out.println("La nave puede llegar a su destino");
        
        }else{
            System.out.println("El combustible restante sería: " +nave1.getcombustible());
            System.out.println("La nave no puede llegar a su destino");
        }

        System.out.println("Informe\n" + "Lugar: " + destino + " Distancia: " + km + "Km "
        + nave1);
    
        scanner.close();
        }    
    }

