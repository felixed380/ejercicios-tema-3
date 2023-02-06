public class cocheex {

    public static void main(String[] args){
        coche miCoche = new coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }
}

class coche {
    public int puertas=0;

    public void AgregarPuerta() {this.puertas++;}
}