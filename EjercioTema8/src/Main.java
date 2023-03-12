/**
*Ejercicio tema 8:
*        Para practicar la encapsulación:
*
*        Crear clase Persona.
*
*        Crear variables las privadas edad, nombre y telefono de la clase Persona.
*
*        Crear gets y sets de cada propiedad.
*
*        Crear un objeto persona en el main.
*
*        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 **/

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(24);
        persona1.setNombre("Pepito Perez");
        persona1.setTelefono(1234567890);
        System.out.println("Nombre: " + persona1.getNombre() + "\nEdad: " + persona1.getEdad() + "\nTeléfono: " + persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}