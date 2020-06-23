package myEjercicio5.adapter;

public class Lavadora implements ArtefactosHogar{

    int costo=3000;
    int tiempoGarantia=2;

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(int tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo de este lavadora :" + costo);
    }

    @Override
    public void tiempoGarantia() {
        System.out.println("El tiempo de garantia de esta lavadora :" + tiempoGarantia+ "años");
    }
}
