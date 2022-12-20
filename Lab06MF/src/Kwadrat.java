public class Kwadrat extends Prostokat
{
    public Kwadrat(double wys, String kolor) {
        super(wys, wys, kolor);
    }

    public double getwys() {
        return wys;
    }

    public double getszer() {
        return szer;
    }

    public String getKolor() {
        return kolor;
    }

    public void setWys(double wys) {
        this.wys = wys;
    }

    public void setSzer(double szer) {
        this.szer = szer;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    String opis() {
        return "Kwadrat o kolorze "+kolor+" o boku "+getwys();
    }
}
