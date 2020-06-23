package myEjercicio5.Visitor;

public class Client {

    public static void main (String []args  ){
        Perro perro = new Perro();
        Gato gato = new Gato();
        Caballo caballo = new Caballo();

        Veterinario veterinario= new Veterinario();

        perro.setNombre("Rocky");
        perro.definirEnfermedad(Veterinario.enfermedades.enfermedad1);
        perro.acceptAtention(veterinario);
        System.out.println("----------------------------");

        gato.setNombre("mia");
        gato.definirEnfermedad(Veterinario.enfermedades.enfermedad2);
        perro.acceptAtention(veterinario);
        System.out.println("----------------------------");

        caballo.setNombre("Fernandiño");
        caballo.definirEnfermedad(Veterinario.enfermedades.enfermedad1);
        caballo.acceptAtention(veterinario);








    }
}
