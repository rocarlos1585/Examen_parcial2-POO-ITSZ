/**
 * Created by robert on 12/05/16.
 */
public class NMplaneador extends Vnomotorizado implements volador{

    public String planear(){

        return "estoy planeando";
    }


    public String despegar() {
        return "estoy despegando";
    }


    public String aterrizar() {
        return "estoy aterrizando";
    }
}
