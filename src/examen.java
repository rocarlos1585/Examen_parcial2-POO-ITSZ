import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robert on 12/05/16.
 */
public class examen {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<SCvehiculos>vehiculos = new ArrayList<>();

    public static void main(String[]args){
        menu();
    }

    public static void menu(){

        int seleccion;
        do {

            System.out.println("selecciona una opcion");
            System.out.println("1- vehiculo motorizado");
            System.out.println("2- vehiculo no motorizado");
            seleccion = Integer.parseInt(scan.nextLine());

            switch (seleccion) {

                case 1:
                    motorizado();
                    break;
                case 2:
                    noMotorizado();
                    break;
            }
        }while(seleccion!=3);


    }


    public static void motorizado(){
        int seleccionM;

        do {
            System.out.println("has seleccionado un vehiculo motorizado, selecciona una opcion");
            System.out.println("1- camion");
            System.out.println("2- helicoptero");
            System.out.println("3- listar camiones");
            System.out.println("4- listar helicopteros");
            System.out.println("5- regresar al menu anterior");
            seleccionM=Integer.parseInt(scan.nextLine());

            switch(seleccionM){

                case 1:
                    camion();
                    break;
                case 2:
                    helicoptero();
                    break;
                case 3:
                    Lcamion();
                    break;
                case 4:
                    Lhelicoptero();
                    break;
            }
        }while (seleccionM!=5);
    }

    public static void camion(){

        Mcamion camion = new Mcamion();

        System.out.println("cuantas personas soporta el camion");
        camion.setPersonas(Integer.parseInt(scan.nextLine()));

        System.out.println("que tamano tiene el camion");
        camion.setTamaño(scan.nextLine());

        System.out.println("cuanto peso soporta el camion");
        camion.setCapacidadPeso(Float.parseFloat(scan.nextLine()));

        System.out.println("cuantos motores tiene el camion");
        camion.setNumeroMotores(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantos caballos de fuerza tiene el camion");
        camion.setCaballosPoder(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantos kilometros ha recorrido el camion");
        camion.setKilometrosRecorridos(Float.parseFloat(scan.nextLine()));

        System.out.println("cuantos minutos ha recorrido el camion");
        camion.setMinutosRecorridos(Integer.parseInt(scan.nextLine()));

        System.out.println("cuanto dinero se ha gastado en el camion");
        camion.setDineroGastado(Float.parseFloat(scan.nextLine()));

        System.out.println("cuantos ejes tiene el camion");
        camion.setEjes(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantas ventanas tiene el camion");
        camion.setVentanas(Integer.parseInt(scan.nextLine()));

        vehiculos.add(camion);

    }

    public static void Lcamion(){
        char Cseleccion;

        for (SCvehiculos OBcamion: vehiculos){

            if(OBcamion instanceof Mcamion) {

                System.out.println("el camion soporta " + OBcamion.getPersonas() + " personas");
                System.out.println("el tamaño del camion es" + OBcamion.getTamaño());
                System.out.println("el camion soporta " + OBcamion.getCapacidadPeso() + " kilos");
                System.out.println("el camion tiene " + ((Mcamion) OBcamion).getNumeroMotores() + " motores");
                System.out.println("el camion tiene " + ((Mcamion) OBcamion).getCaballosPoder() + " caballos de fuerza");
                System.out.println("el camion ha recorrido " + ((Mcamion) OBcamion).getKilometrosRecorridos() + " kilometros");
                System.out.println("el camion ha recorrido " + ((Mcamion) OBcamion).getMinutosRecorridos() + " minutos");
                System.out.println("se ha gastado " + ((Mcamion) OBcamion).getDineroGastado() + " pesos");
                System.out.println("el camion tiene " + ((Mcamion) OBcamion).getEjes() + " ejes");
                System.out.println("el camion tiene " + ((Mcamion) OBcamion).getVentanas() + " ventanas");
                System.out.println("vas a subir pasaje? s/n");
                Cseleccion = scan.next().charAt(0);
                if (Cseleccion == 's') {
                    System.out.println(((Mcamion) OBcamion).getsubirPasaje());
                } else {
                    System.out.println(((Mcamion) OBcamion).getbajarPasaje());
                }
            }
        }
    }

    public static void helicoptero() {
        Mhelicoptero helicoptero = new Mhelicoptero();

        System.out.println("cuantas personas soporta el helicoptero");
        helicoptero.setPersonas(Integer.parseInt(scan.nextLine()));

        System.out.println("que tamano tiene el helicoptero");
        helicoptero.setTamaño(scan.nextLine());

        System.out.println("cuanto peso soporta el helicoptero");
        helicoptero.setCapacidadPeso(Float.parseFloat(scan.nextLine()));

        System.out.println("cuantos motores tiene el helicoptero");
        helicoptero.setNumeroMotores(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantos caballos de fuerza tiene el helicoptero");
        helicoptero.setCaballosPoder(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantos kilometros ha recorrido el helicoptero");
        helicoptero.setKilometrosRecorridos(Float.parseFloat(scan.nextLine()));

        System.out.println("cuantos minutos ha recorrido el helicoptero");
        helicoptero.setMinutosRecorridos(Integer.parseInt(scan.nextLine()));

        System.out.println("cuanto dinero se ha gastado en el helicoptero");
        helicoptero.setDineroGastado(Float.parseFloat(scan.nextLine()));

        vehiculos.add(helicoptero);
    }

    public static void Lhelicoptero(){

        int Hseleccion=0;
        char despegue;

        for (SCvehiculos OBhelicoptero:vehiculos){

            if(OBhelicoptero instanceof Mhelicoptero) {

            System.out.println("el helicoptero soporta " + OBhelicoptero.getPersonas()+" personas");
            System.out.println("el helicoptero tiene un tamano "+OBhelicoptero.getTamaño());
            System.out.println("el helicoptero soporta "+OBhelicoptero.getCapacidadPeso()+" kilos");
            System.out.println("el helicoptero tiene "+((Mhelicoptero) OBhelicoptero).getNumeroMotores()+" motores");
            System.out.println("el helicoptero tiene "+((Mhelicoptero) OBhelicoptero).getCaballosPoder()+" caballos de fuerza");
            System.out.println("el helicoptero ha recorrido "+((Mhelicoptero) OBhelicoptero).getKilometrosRecorridos()+" kilometros");
            System.out.println("el helicoptero ha recorrido "+((Mhelicoptero) OBhelicoptero).getMinutosRecorridos()+" minutos");
            System.out.println("se ha gastado "+((Mhelicoptero) OBhelicoptero).getDineroGastado()+" pesos");

                do {
                    System.out.println("el helicptero esta listo, que deseas hacer?");
                    System.out.println("1- encender rotor principal");
                    System.out.println("2- encender rotor trasero");
                    System.out.println("3- encender ambos rotores");
                    System.out.println("4- apagar rotor principal");
                    System.out.println("5- apagar rotor trasero");
                    System.out.println("6- apagar ambos rotores");
                    System.out.println("7- despegue");
                    System.out.println("8- salir");
                    Hseleccion = Integer.parseInt(scan.nextLine());

                    switch (Hseleccion) {
                        case 1:
                            System.out.println(((Mhelicoptero) OBhelicoptero).getiniciarRotorPrincipal());
                            break;
                        case 2:
                            System.out.println(((Mhelicoptero) OBhelicoptero).getiniciarRotorTrasero());
                            break;
                        case 3:
                            System.out.println("ambos rotores estan encendidos");
                            break;
                        case 4:
                            System.out.println(((Mhelicoptero) OBhelicoptero).getdetenerRotorPrincipal());
                            break;
                        case 5:
                            System.out.println(((Mhelicoptero) OBhelicoptero).getdetenerRotorTrasero());
                            break;
                        case 6:
                            System.out.println("ambos rotores estan detenidos");
                            break;
                        case 7:
                            System.out.println("deseas despegar? s/n");
                            despegue = scan.next().charAt(0);

                            if (despegue == 's'){
                                System.out.println(((Mhelicoptero) OBhelicoptero).despegar());
                            }
                            else{
                                System.out.println("deseas aterrizar?");
                                despegue=scan.next().charAt(0);
                                if (despegue=='s'){
                                    System.out.println(((Mhelicoptero) OBhelicoptero).aterrizar());
                                }
                            }
                            break;
                    }
                }while(Hseleccion != 8);


            //System.out.println("quieres iniciar el rotor principal? s/n");
            //Hseleccion = scan.next().charAt(0);

              //  if (Hseleccion=='s'){
                //    ((Mhelicoptero) OBhelicoptero).getiniciarRotorPrincipal();
                //}
                //else{
                  //  System.out.println("quieres iniciar el rotor trasero?");
                    //Hseleccion=scan.next().charAt(0);

                    //if (Hseleccion=='s'){
                     //   ((Mhelicoptero) OBhelicoptero).getiniciarRotorTrasero();
                    //}

                }
        }

        }

    public static void noMotorizado(){
        int seleccionNM;

        do {
            System.out.println("has seleccionado un vehiculo no motorizado, selecciona una opcion");
            System.out.println("1- planeador");
            System.out.println("2- bicicleta");
            System.out.println("3- listar planeadores");
            System.out.println("4- listar bicicletas");
            System.out.println("5- regresar al menu anterior");
            seleccionNM = Integer.parseInt(scan.nextLine());

            switch(seleccionNM){

                case 1:
                    planeador();
                    break;
                case 2:
                    bicicleta();
                    break;
                case 3:
                    Lplaneador();
                    break;
                case 4:
                    Lbicicleta();
                    break;
            }
        }while(seleccionNM!=5);
    }

    public static void planeador(){
        NMplaneador planeador = new NMplaneador();

        System.out.println("cuantas personas soporta el planeador");
        planeador.setPersonas(Integer.parseInt(scan.nextLine()));

        System.out.println("de que tamano es el planeador");
        planeador.setTamaño(scan.nextLine());

        System.out.println("cuanto peso soporta el planeador");
        planeador.setCapacidadPeso(Float.parseFloat(scan.nextLine()));

        System.out.println("cuanto pesa el planeador");
        planeador.setPeso(Integer.parseInt(scan.nextLine()));

        System.out.println("cuanto mide de alto el planeador");
        planeador.setAlto(Integer.parseInt(scan.nextLine()));

        System.out.println("cuanto mide de ancho el planeador");
        planeador.setAncho(Integer.parseInt(scan.nextLine()));

        vehiculos.add(planeador);
    }

    public static void Lplaneador(){
        for(SCvehiculos OBplaneador:vehiculos){
            if(OBplaneador instanceof NMplaneador){
                System.out.println("el planeador soporta hasta "+OBplaneador.getPersonas()+" personas");
                System.out.println("el planeador tiene un tamano de "+OBplaneador.getTamaño()+" metros");
                System.out.println("el planeador soporta "+OBplaneador.getCapacidadPeso()+" kilos");
                System.out.println("el planeador pesa "+((NMplaneador) OBplaneador).getPeso()+" kilos");
                System.out.println("el planeador mide "+((NMplaneador) OBplaneador).getAlto()+" metros de alto");
                System.out.println("el planeador mide "+((NMplaneador) OBplaneador).getAncho()+" metros de ancho");
            }
        }
    }

    public static void bicicleta(){
        NMbicicleta bicicleta = new NMbicicleta();

        System.out.println("cuantas personas soporta la bicicleta");
        bicicleta.setPersonas(Integer.parseInt(scan.nextLine()));

        System.out.println("de que tamano es la bicicleta");
        bicicleta.setTamaño(scan.nextLine());

        System.out.println("cuanto peso soporta la bicicleta");
        bicicleta.setCapacidadPeso(Float.parseFloat(scan.nextLine()));

        System.out.println("cual es el peso de la bicicleta");
        bicicleta.setPeso(Integer.parseInt(scan.nextLine()));

        System.out.println("cuanto mide de alto la bicicleta");
        bicicleta.setAlto(Integer.parseInt(scan.nextLine()));

        System.out.println("cuanto mide de ancho la bicicleta");
        bicicleta.setAncho(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantos cambios tiene la bicicleta");
        bicicleta.setNumeroCambios(Integer.parseInt(scan.nextLine()));

        System.out.println("que tipo de bicicleta es");
        bicicleta.setTipoBicicleta(scan.nextLine());

        System.out.println("que rodado tiene");
        bicicleta.setRodado(Integer.parseInt(scan.nextLine()));

        vehiculos.add(bicicleta);

    }

    public static void Lbicicleta(){
        for(SCvehiculos OBbicicleta:vehiculos){
            if(OBbicicleta instanceof NMbicicleta){
                System.out.println("el bicicleta soporta hasta "+OBbicicleta.getPersonas()+" personas");
                System.out.println("el bicicleta tiene un tamano de "+OBbicicleta.getTamaño()+" metros");
                System.out.println("el bicicleta soporta "+OBbicicleta.getCapacidadPeso()+" kilos");
                System.out.println("el bicicleta pesa "+((NMbicicleta) OBbicicleta).getPeso()+" kilos");
                System.out.println("el bicicleta mide "+((NMbicicleta) OBbicicleta).getAlto()+" metros de alto");
                System.out.println("el bicicleta mide "+((NMbicicleta) OBbicicleta).getAncho()+" metros de ancho");
                System.out.println("la biciclta tiene "+((NMbicicleta) OBbicicleta).getNumeroCambios()+" cambios");
                System.out.println("es una bicicleta "+((NMbicicleta) OBbicicleta).getTipoBicicleta());
                System.out.println("es rodado "+((NMbicicleta) OBbicicleta).getRodado());
            }
        }
    }


}
