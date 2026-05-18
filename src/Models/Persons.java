package Models;

public class Persons {
    private String nombre;
    private int edad;

    public Persons() {
    }
    public Persons(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persons [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
