public class Main {
    public static void main(String[] args)
    {
        var autobus = new Samochod("Autosan", "City", "Osobowe","Niebieski",1990, 200000);
        var bus = new Samochod();
        var corsa = new SamochodOsobowy();

        autobus.opis();
        bus.opis();
        corsa.opis();

    }
}