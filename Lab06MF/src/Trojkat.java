class Trojkat extends Figura
{
    double wys, podst;

    Trojkat(double wys, double podst)
    {
        this.wys = wys;
        this.podst = podst;
    }

    public Trojkat(double wys, double podst,String kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    @Override
    String opis() {
        return "Trojkat o kolorze: "+kolor+", o podstawie: "+podst+", i wysokosci: "+wys;
    }
}