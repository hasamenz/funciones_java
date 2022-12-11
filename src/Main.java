public class Main {

    public static int sumar(int a, int b, int c){
        //System.out.println("Esta es una funcion");
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sumar(4,5,16));

        coche micoche = new coche();

        micoche.agregarPuerta();
        micoche.agregarPuerta();
        micoche.agregarPuerta();

        System.out.println(micoche.puerta);


    }
}
    //CREANDO UNA CLASE COCHE
    class coche {
        public int puerta = 4;

        public void agregarPuerta(){
            this.puerta++;
        }
    }

    //CREANDO UNA CLASE POTATO
    