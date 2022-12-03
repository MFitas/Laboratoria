import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        var p1 = new Rectangle(2,5);
        System.out.println("Rectangle with sides equal to: "+p1.getWidth() +
                " and " + p1.getLength() + " has Area equal to: " +p1.getArea()+
                " has Circumference equal to "+p1.getCircumference()+
                " and has diagonal equal to: "+ p1.getdiagonal());

        Building bud1 = new Building("domek", LocalDate.of(1990,10,15),2);
        Building bud2 = new Building("mały domek", LocalDate.of(1950,10,15),2);
        Building bud3 = new Building("duży domek", LocalDate.of(1999,10,15),2);

        System.out.println("Wiek budynku: "+bud1.wiekBudynku());
        bud1.piszDane();
        bud2.piszDane();
        bud3.piszDane();

    }
}