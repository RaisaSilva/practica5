package myEjercicio5.adapter;

public class Celulares implements ArtefactosDeMano{
    int numprecio=3000;
    int numtiempo =5;

    public int getNumPrecio() {
        return numprecio;
    }

    public void setNumPrecio(int precio) {
        this.numprecio = precio;
    }

    public int getNumtiempo() {
        return numtiempo;
    }

    public void setNumtiempo(int numtiempo) {
        this.numtiempo = numtiempo;
    }

    @Override
    public void precio() {
        System.out.println("El precio de este Celular :" + numprecio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Tiempo de vida de este Celular :" + numtiempo +" años");

    }
}
