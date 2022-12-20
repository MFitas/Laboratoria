public class Okrag extends Figura
{
    Point srodek;
    double promien;

    final double Pi = 3.14;

    public Okrag() {
    }

    public Okrag(Point srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public Point getSrodek() {
        return srodek;
    }

    public double getPromien() {
        return promien;
    }

    public void setSrodek(Point srodek) {
        this.srodek = srodek;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPowierzchnia(){

        return promien*promien*Pi;
    }

    public double getSrednica(){
       return promien*2;
    }

    public boolean wSrodku(Point punkt){
      return Math.pow(this.srodek.getX() - punkt.getX(), 2) + Math.pow(this.srodek.getY() - punkt.getY(), 2) >= promien*promien;
    }

    @Override
    String opis() {
        return "Okrąg o promieniu: "+promien+", z środkiem w punkcie: "+srodek.opis()+", o kolorze: "+kolor;
    }
}
