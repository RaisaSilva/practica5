package myEjercicio5.adapter;

public class Computadoras implements ArtefactosDeMano{
    int numprecio=8500;
    int tiempoVida=10;

    public int getNumPrecio() {
        return numprecio;
    }

    public void setNumPrecio(int precio) {
        this.numprecio = precio;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void precio() {
        System.out.println("El precio de este Computador:" + numprecio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Tiempo de vida de este Computador :" + tiempoVida+" años");

    }
}
