public class Main {

    public static void main(String[] args) {
        // Primera Parte
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int suma = sumarNumeros(n1, n2, n3);
        System.out.println("La suma de los números es: " + suma);

        // Segunda Parte
        Carro miCarro = new Carro();
        miCarro.anadirPuerta();
        System.out.println("El auto tiene " + miCarro.numPuertas + " puertas.");
    }
    public static int sumarNumeros(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
// Clase Auto
class Carro {
    int numPuertas;

    public Carro() {
        this.numPuertas = 6; // Por defecto, el coche tiene 4 puertas
    }
    public void anadirPuerta() {
        this.numPuertas += 1;
    }
}
