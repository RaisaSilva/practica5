package myEjercicio5.adapter;

public class Refrigerador implements ArtefactosHogar{

    int costo=7400;
    int tiempoGarantia=5;

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
        System.out.println("El costo de este Refrigerador :" + costo);
    }

    @Override
    public void tiempoGarantia() {
        System.out.println("El tiempo de garantia de este Refrigerador :" + tiempoGarantia+" años");
    }
}
