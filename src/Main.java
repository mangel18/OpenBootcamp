public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumar_puertas();
        System.out.println(miCoche.num_puertas);
    }


    /* main
    int resultado = 0;
    resultado = suma(10,20,30);
        System.out.println(resultado);
        */

    public static int  suma(int a, int b, int c){
        return a+b+c;
    }
}
    class Coche{

        public int num_puertas = 4;

        public void sumar_puertas(){
            this.num_puertas++;
        }

}