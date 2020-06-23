package myEjercicio5.Visitor;

public class Caballo implements Animales {
    private String nombre;
    private Veterinario.enfermedades enfermedad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void acceptAtention(IVisitor visitor) {
        visitor.curar(this);
    }

    @Override
    public void definirEnfermedad(Veterinario.enfermedades enfermedadEsp) {
        this.enfermedad = enfermedadEsp;
        System.out.println("El Caballo "+nombre+", tiene la enfermedad: "+enfermedad);

    }


}
