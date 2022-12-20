public class Main {
    public static void main(String[] args) {
        var punkt = new Point();
        var punkt1 = new Point(1,2);
        var punkt2 = new Point(2,5);
        punkt.setX(2);
        punkt.setY(5);
        punkt.opis();
        punkt.przesun(punkt1.getX(), punkt1.getY());

       var figura = new Figura(punkt);
       figura.kolor = "niebieski";
       var figura1 = new Figura("czarny");
       System.out.println(figura.opis()+" " + figura1.opis());


       var prostokat = new Prostokat(5,5);
       prostokat.getPowierzchnia();

       var trojkat = new Trojkat(5,2);

       prostokat.przesun(punkt2.x, punkt2.y);

       var kwadrat = new Kwadrat(2,"bialy");
    }
}