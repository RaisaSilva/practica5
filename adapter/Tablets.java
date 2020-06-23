package myEjercicio5.adapter;

public class Tablets implements ArtefactosDeMano{
    int numprecio=700;
    int tiempoVida=7;

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
        System.out.println("El precio de este Tablet :" + numprecio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Tiempo de vida de este Tablet :" + tiempoVida+" años");

    }
}
