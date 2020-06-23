package myEjercicio5.adapter;


public class Cliente {
    public static void main(String[] args) {

        AdapaterHogar adapaterHogar = new AdapaterHogar();

        Celulares cel  = new Celulares();
        Tablets tablet = new Tablets();
        Computadoras compu = new Computadoras();

        Televisor tele = new Televisor();
        Lavadora lavadora = new Lavadora();
        Refrigerador refrigerador = new Refrigerador();

        adapaterHogar.setAdaptee(tele);
        adapaterHogar.precio();
        adapaterHogar.tiempoDeVida();
        System.out.println("--------------------------");

        adapaterHogar.setAdaptee(refrigerador);
        adapaterHogar.precio();
        adapaterHogar.tiempoDeVida();
        System.out.println("--------------------------");

        adapaterHogar.setAdaptee(lavadora);
        adapaterHogar.precio();
        adapaterHogar.tiempoDeVida();
        System.out.println("--------------------------");

        cel.precio();
        cel.tiempoDeVida();
        System.out.println("--------------------------");
        tablet.precio();
        cel.tiempoDeVida();
        System.out.println("--------------------------");
        compu.precio();
        cel.tiempoDeVida();
    }
}
