package myEjercicio5.adapter;

public class Televisor implements ArtefactosHogar{

    int costo=1300;
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
        System.out.println("El costo de este televisor :" + costo);
    }

    @Override
    public void tiempoGarantia() {
        System.out.println("El tiempo de garantia de este televisor :" + tiempoGarantia+" años");
    }
}
