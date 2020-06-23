package myEjercicio5.Visitor;

public interface IVisitor {

    void curar(Perro perro);
    void curar(Caballo caballo);
    void curar(Gato gato);

}
