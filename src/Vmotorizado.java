/**
 * Created by robert on 12/05/16.
 */
public class Vmotorizado extends SCvehiculos{

    int numeroMotores;
    int caballosPoder;
    float kilometrosRecorridos;
    int minutosRecorridos;
    float dineroGastado;




    public void setNumeroMotores(int numeroMotores){

        this.numeroMotores=numeroMotores;
    }

    public int getNumeroMotores(){

        return numeroMotores;
    }

    public void setCaballosPoder(int caballosPoder){

        this.caballosPoder=caballosPoder;
    }

    public int getCaballosPoder(){

        return caballosPoder;
    }

    public void setKilometrosRecorridos(float kilometrosRecorridos){

        this.kilometrosRecorridos=kilometrosRecorridos;
    }

    public float getKilometrosRecorridos(){

        return kilometrosRecorridos;
    }

    public void setMinutosRecorridos(int minutosRecorridos){

        this.minutosRecorridos=minutosRecorridos;
    }

    public int getMinutosRecorridos(){
        return minutosRecorridos;
    }

    public void setDineroGastado(float dineroGastado){
        this.dineroGastado=dineroGastado;
    }

    public float getDineroGastado(){
        return dineroGastado;
    }


    public String encenderMotor(){
        return "motor encendido";
    }

    public String acelerar(){
        return "acelerando...";
    }

    public String apagarMotor(){
        return "motor apagado";
    }

    public float velocidad(){

        float velocidad;

        velocidad= getKilometrosRecorridos()/getMinutosRecorridos();

        return velocidad;

    }

    //falta el metodo de rendimiento
}
