package myEjercicio5.Visitor;

import java.time.LocalDateTime;

public class Veterinario implements IVisitor {

    public enum enfermedades{
        enfermedad1, enfermedad2
    }

    @Override
    public void curar(Perro perro) {
        System.out.println("Animal curado : Perro "+ LocalDateTime.now());

    }

    @Override
    public void curar(Caballo caballo) {
        System.out.println("Animal curado: Caballo"+ LocalDateTime.now());
    }

    @Override
    public void curar(Gato gato) {
        System.out.println("Animal curado: Gato"+ LocalDateTime.now());
    }


}
