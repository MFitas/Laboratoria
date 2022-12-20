import java.util.Scanner;

public class SamochodOsobowy extends Samochod
{
    double Waga, PojemnoscSilnika;
    int IloscOsob;

    public SamochodOsobowy()
    {
        var scanner = new Scanner(System.in);
        Marka = scanner.next();
        Model = scanner.next();
        Nadwozie = scanner.next();
        Kolor = scanner.next();
        RokProdukcji = scanner.nextInt();
        setPrzebieg(scanner.nextInt());

        IloscOsob = scanner.nextInt();
    }

    public void setWaga(double waga) {
        if (waga <2 || waga>4.5)
            throw new IllegalArgumentException("Waga nie moze byc mniejsza od 2 ton i przekraczac 4.5 tony");
        this.Waga = waga;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        if (pojemnoscSilnika <0.8 || pojemnoscSilnika>3.0)
            throw new IllegalArgumentException("Pojemnosc silnika nie moze byc mniejsza od 0,8 litra i przekraczac 3.0 litra");
        this.PojemnoscSilnika = pojemnoscSilnika;
    }

    public void opis(){
        System.out.println("Parametry Samochodu Osobowego: " + Marka + " " + Model + " " + Nadwozie + " " + Kolor + " " + RokProdukcji + " " + Przebieg + " " + Waga + " " + PojemnoscSilnika + " " + IloscOsob);
    }
}
