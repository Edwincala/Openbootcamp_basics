public class Main {
    public static void main(String[] args) {
        // parte 1
        System.out.print("Parte 1: ");
        compIf(15);
        // parte 2
        System.out.print("Parte 2: ");
        whileCycle(-5);
        // parte 3
        System.out.print("Parte 3: ");
        doWhileCycle(2);
        // parte 4
        System.out.print("Parte 4: ");
        forCycle();
        // parte 5
        System.out.print("Parte 5: ");
        switchEstaciones("Verano");
    }

    // Método if, primera parte
    public static void compIf (int numeroIf) {
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negatvo");
        } else {
            System.out.println("El número es igual a 0");
        }
    }

    // Parte dos, ciclo while
    public static void whileCycle (int numeroWhile) {
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    // Parte 3, ciclo do-while
    public static void doWhileCycle (int numeroWhile) {
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
    }

    // Parte 4, ciclo for
    public static void forCycle () {
        int numeroFor;
        for(numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    // Parte 5, switch
    public static void switchEstaciones(String Estacion) {
        switch (Estacion) {
            case "Primavera":
                System.out.println("Es primavera, debes cuidar de tu jardín");
                break;
            case "Verano":
                System.out.println("Es verano, vaya calor, sal al parque de vez en cuando");
                break;
            case "Otoño":
                System.out.println("Es otoño, las hojas de los árboles caen");
                break;
            case "Invierno":
                System.out.println("Es invierno, mejor ponte un abrigo");
                break;
            default:
                System.out.println("Lo que lleva año, las estaciones me las he pasado genial, espero tú igual");
        }
    }
}