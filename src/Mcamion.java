/**
 * Created by robert on 12/05/16.
 */
public class Mcamion extends Vmotorizado {

    int numeroEjes;
    int numeroVentanas;

    public void setEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getEjes(){
        return numeroEjes;
    }

    public void setVentanas(int numeroVentanas){
        this.numeroVentanas = numeroVentanas;
    }

    public int getVentanas(){
        return numeroVentanas;
    }

    public String getsubirPasaje(){

        return "subiendo pasaje";
    }

    public String getbajarPasaje(){

        return "bajando pasaje";
    }
}
