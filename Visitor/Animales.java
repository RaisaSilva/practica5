package myEjercicio5.Visitor;

public interface Animales {

    void acceptAtention(IVisitor visitor);
    void definirEnfermedad(Veterinario.enfermedades enfermedad);
}

