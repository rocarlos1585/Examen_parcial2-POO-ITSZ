/**
 * Created by robert on 12/05/16.
 */
public class NMbicicleta extends Vnomotorizado {

    int numeroCambios;
    String tipoBicicleta;
    int rodado;

    public void setNumeroCambios(int numeroCambios){
        this.numeroCambios = numeroCambios;
    }

    public int getNumeroCambios(){
        return numeroCambios;
    }

    public void setTipoBicicleta(String tipoBicicleta){
        this.tipoBicicleta=tipoBicicleta;
    }

    public String getTipoBicicleta(){
        return tipoBicicleta;
    }

    public void setRodado(int rodado){
        this.rodado=rodado;
    }

    public int getRodado(){
        return rodado;
    }

    public String cambiarSprocket(){
        return "es necesario cambiar el sprocket";
    }

    public String cambiarSprock(){
        return "es necesario cambiar el sprock";
    }
}
