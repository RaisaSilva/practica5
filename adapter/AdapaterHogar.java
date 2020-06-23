package myEjercicio5.adapter;

public class AdapaterHogar implements ArtefactosDeMano{

    ArtefactosHogar adaptee;

    public ArtefactosHogar getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(ArtefactosHogar adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void precio() {
        adaptee.costo();

    }

    @Override
    public void tiempoDeVida() {
        adaptee.tiempoGarantia();

    }
}
