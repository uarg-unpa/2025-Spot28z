package TP02.Punto5;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;


    //Constructor
    public Hora(int hora, int minutos, int segundos){
        if (validacion(hora, minutos, segundos)){
            this.hora= hora;
            this.minutos= minutos;
            this.segundos = segundos;
        }else{
            this.hora= 0;
            this.minutos= 0;
            this.segundos= 0;
        }
    }

    //método get
    public int getHora(){
        return this.hora;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public int getSegundos(){
        return this.segundos;
    }

    //método set
    public void setHora(int hora){
        this.hora= hora;
    }
    public void setMinutos(int minutos){
        this.minutos= minutos;
    }
    public void setSegundos(int segundos){
        this.segundos= segundos;
    }

    //otros métodos
    public boolean validacion (int hh, int mm, int ss){
        return (hh >= 0 && hh <= 23) && (mm >= 0 && mm <= 59) && (ss >= 0 && ss <= 59);
    }

    public String formatoHora(){
        return String.format("%02d:%02d:%02d", this.hora, this.minutos, this.segundos);
    }
    
    public int convertirEnMinutos(){
        return this.hora * 60 + this.minutos + (this.segundos * 60);
    }
    
    public int convertirEnSegundos(){
        int calculoM= this.minutos + (this.hora / 60);
        return this.segundos + (calculoM * 60);
    }
}