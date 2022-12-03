public class Gatunek
{
    String NazwaRodzajowa, NazwaGatunkowa,Opis;
    int liczbachormosomow, chromosomyX;

    public Gatunek(String nazwaRodzajowa, String nazwaGatunkowa, String opis, int liczbachormosomow, int chromosomyX) {
        NazwaRodzajowa = nazwaRodzajowa;
        NazwaGatunkowa = nazwaGatunkowa;
        Opis = opis;
        this.liczbachormosomow = liczbachormosomow;
        this.chromosomyX = chromosomyX;
    }

    public Gatunek(Gatunek that) {
        this(that.getNazwaGatunkowa(), that.getNazwaRodzajowa(), that.getOpis(), that.getLiczbachormosomow(), that.getChromosomyX());
    }

    @Override
    public String toString() {
        return "Gatunek" +
                "NazwaRodzajowa='" + NazwaRodzajowa + '\'' +
                ", NazwaGatunkowa='" + NazwaGatunkowa + '\'' +
                ", Opis='" + Opis + '\'' +
                ", liczbachormosomow=" + liczbachormosomow +
                ", chromosomyX=" + chromosomyX;
    }

    public String getNazwaRodzajowa() {
        return NazwaRodzajowa;
    }

    public String getNazwaGatunkowa() {
        return NazwaGatunkowa;
    }

    public String getOpis() {
        return Opis;
    }

    public int getLiczbachormosomow() {
        return liczbachormosomow;
    }

    public int getChromosomyX() {
        return chromosomyX;
    }

    public void setNazwaRodzajowa(String nazwaRodzajowa) {
        NazwaRodzajowa = nazwaRodzajowa;
    }

    public void setNazwaGatunkowa(String nazwaGatunkowa) {
        NazwaGatunkowa = nazwaGatunkowa;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public void setLiczbachormosomow(int liczbachormosomow) {
        this.liczbachormosomow = liczbachormosomow;
    }

    public void setChromosomyX(int chromosomyX) {
        this.chromosomyX = chromosomyX;
    }

    public void pelnaNazwa(){
        System.out.println("Pełna Nazwa: "+getNazwaGatunkowa()+getNazwaRodzajowa());
    }

    public int haploidalnaLiczbachromosomow(){
        return getLiczbachormosomow()/2;
    }


}
