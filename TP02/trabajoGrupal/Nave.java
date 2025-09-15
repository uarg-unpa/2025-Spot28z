/*una simulacion espacial registra naves con nombre, velocidad máxima(en km/h), combustible restante (en litros) y destino.
Los jugadores quieren verificar si una nave puede llegar a su destino (combustible >1000), acelerar
(aumentar velocidad) y mostrar un informe de la misión.
10 km = 1L
 */

public class Nave {
    private String nombre;
    private double combustible;
    private int velocidadM;
    private int rendimiento;

    //Constructor
    public Nave(String nombre, int velocidadM, int rendimiento, double combustible){
        this.nombre= nombre;
        this.combustible= combustible;
        this.velocidadM= velocidadM;
        this.rendimiento= rendimiento;
    }

    //método get

    public String getnombre(){
        return this.nombre;
    }
    public double getcombustible(){
        return this.combustible;
    }
    public int getvelocidadM(){
        return this.velocidadM;
    }

    //método set

    public void setNombre(String name){
        this.nombre= name;
    }
    public void setCombustible(double combustible){
        this.combustible= combustible;
    }
    public void setVelocidadM(int velocidad){
        this.velocidadM= velocidad;
    }


    //otros métodos
    public double calculoCombustible(double km){
        return this.combustible - (km / this.rendimiento);
    }  //cuánto combustible gasta por cada kilómetro recorrido

    public boolean esMayor(double km){
        return this.combustible > this.calculoCombustible(km);
    }  //pregunta si llega al destino con el combustible disponible

    public String toString(){
        return "Nave [Nombre="+ this.nombre+ ", velocidad:" + this.velocidadM + "Km/h , Combustible:" + this.combustible + " L, Rendimiento:" + this.rendimiento + "Km/L ]";
    }
}
