/*
* Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.*/
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(28);
        cliente1.setNombre("Felipe Becerra");
        cliente1.setTelefono(1357924680);
        cliente1.setCredito(15000);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(31);
        trabajador1.setNombre("Camilo Bastidas");
        trabajador1.setTelefono(1168013510);
        trabajador1.setSalario(65000);

        String propiedadesCliente1 = "Nombre: " + cliente1.getNombre() + "\nEdad: " + cliente1.getEdad() + "\nTeléfono: " + cliente1.getTelefono() + "\nCrédito: "+ cliente1.getCredito();
        String propiedadesTrabajador1 = "Nombre: " + trabajador1.getNombre() + "\nEdad: " + trabajador1.getEdad() + "\nTeléfono: " + trabajador1.getTelefono() + "\nSalario: "+ trabajador1.getSalario();

        System.out.println("Propiedades del cliente:");
        System.out.println(propiedadesCliente1);
        System.out.println("\nPropiedades del trabajador:");
        System.out.println(propiedadesTrabajador1);
    }
}

abstract class Persona{
    private int edad;
    private String nombre;
    private long telefono;

    public Persona() {

    }

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

class Cliente extends Persona{
    private int credito;

    public Cliente() {

    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public Trabajador() {

    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}