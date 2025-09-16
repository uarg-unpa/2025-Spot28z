package TP02.Punto4;

public class Televisor {
    private String marca;
    private String modelo;
    private String estado;
    private int volumen;
    private int canal;
    private int canalAnterior;


    //constructor
    public Televisor (String marca, String modelo, String estado, int volumen, int canal){
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.volumen = volumen;
        this.canal = canal;
        this.canalAnterior = canal;
    }


    //Método Get
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getEstado(){
        return this.estado;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public int getCanal(){
        return this.canal;
    }

    //Métodos set

    public void setMarca(String marca){
        this.marca= marca;
    }
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    public void setEstado(String estado){
        this.estado= estado;
    }
    public void setVolumen(int volumen){
        this.volumen= volumen;
    }
    public void setCanal(int canal){
        this.canal= canal;
    }
    

    //otros métodos
    //limitar volumen
    public void modificadorVolumen(int cambio){
        if (cambio < 0){
            this.volumen= 0;
        }else if (cambio > 100){
            this.volumen= 100;
        }else{
            this.volumen= cambio;
        }
    }
    //limitar cantidad de canales
    public void modificadorCanal(int cambio){
        if (cambio < 0){
            this.canal= 1;
        }else if (cambio > 700){
            this.canal = 700;
        }else{
            this.canal= cambio;
        }
    }
    
    public void canalAnterior(int condicion){
        if (condicion == 1){
            this.canal=this.canalAnterior;
        }
    }

    public String getInformacion(){
        return "Marca: " + this.getMarca() + " Modelo: " + this.getModelo() + " Estado: " + this.getEstado() + " Volumen: " + this.getVolumen() + " Canal: " + this.getCanal();

    }

}
