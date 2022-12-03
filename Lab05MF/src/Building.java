import java.time.LocalDate;
import java.time.Period;

public class Building
{
    String Nazwa;
    LocalDate RokBudowy;
    int LiczbaPieter;

    public Building(String nazwa, LocalDate rokBudowy, int licczbaPieter) {
        Nazwa = nazwa;
        RokBudowy = rokBudowy;
        LiczbaPieter = licczbaPieter;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public LocalDate getRokBudowy() {
        return RokBudowy;
    }

    public int getLiczbaPieter() {
        return LiczbaPieter;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public void setRokBudowy(LocalDate rokBudowy) {
        RokBudowy = rokBudowy;
    }

    public void setLiczbaPieter(int liczbaPieter) {
        LiczbaPieter = liczbaPieter;
    }

    public void piszDane(){
        System.out.println("Nazwa budynku: "+this.Nazwa);
        System.out.println("Liczba pieter: "+this.LiczbaPieter);
        System.out.println("Rok budowy: "+this.RokBudowy);
    }

    public int wiekBudynku(){
        LocalDate aktualnyRok = LocalDate.now();
        Period diff = Period.between(this.RokBudowy, aktualnyRok);
        return diff.getYears();
    }
}
