/**
 * Created by robert on 12/05/16.
 */
public class SCvehiculos {

    int capacidadPersonas;
    float capacidadPeso;
    String tamaño;

    public void setPersonas(int capacidadPersonas){

        this.capacidadPersonas=capacidadPersonas;
    }

    public int getPersonas(){
        return capacidadPersonas;
    }

    public void setCapacidadPeso(float capacidadPeso){
        this.capacidadPeso=capacidadPeso;
    }

    public float getCapacidadPeso(){
        return capacidadPeso;
    }

    public void setTamaño(String tamaño){
        this.tamaño=tamaño;
    }

    public String getTamaño(){
        return tamaño;
    }


    public String avanzar(){
        return "avanzando";
    }

    public String detener(){
        return "deteniendose";
    }
}
