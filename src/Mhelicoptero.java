/**
 * Created by robert on 12/05/16.
 */
public class Mhelicoptero extends Vmotorizado implements volador {

    public String getiniciarRotorPrincipal(){

        return "iniciando rotor principal";
    }

    public String getiniciarRotorTrasero(){

        return "iniciando rotor trasero";
    }

    public String getdetenerRotorPrincipal(){

        return "rotor principal detenido";
    }

    public String getdetenerRotorTrasero(){

        return "rotor trasero detenido";
    }


    public String despegar() {
        return "a punto de despegar";
    }


    public String aterrizar() {
        return "estoy aterrizando....";
    }
}
