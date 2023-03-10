public class Main {
    public static void main(String[] args) {
        // Parte 1
        int resultado1;
        resultado1 = sumaDeTres(15, 20, 25);
        System.out.println("Suma de los tres valores: " + resultado1);
        // Parte 2
        Coche miCoche = new Coche();
        miCoche.numPuertas = 4;
        miCoche.increaseNumPuertas(1);
        System.out.println("El coche tiene " + miCoche.numPuertas+ " puertas.");
    }

    // Función para sumar los tre valores entre sí
    public static int sumaDeTres(int a, int b, int c) {
        return a + b + c;
    }
}

