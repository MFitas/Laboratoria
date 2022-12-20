class Prostokat extends Figura
{
    double wys, szer;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    public Prostokat(double wys, double szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(int x, int y){
        this.punkt.setX(this.punkt.getX()+x);
        this.punkt.setY(this.punkt.getY()+y);
    }

    @Override
    String opis() {
        return "Prostakat, o kolorze: "+ getKolor()+ " o boku a: "+wys+" i boku b "+szer;
    }
}