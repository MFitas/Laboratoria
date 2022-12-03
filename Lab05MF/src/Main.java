public class Main {
    public static void main(String[] args)
    {
        var p1 = new Rectangle(2,5);
        System.out.println("Rectangle with sides equal to: "+p1.getWidth() +
                " and " + p1.getLength() + " has Area equal to: " +p1.getArea()+
                " has Circumference equal to "+p1.getCircumference()+
                " and has diagonal equal to: "+ p1.getdiagonal());
    }
}