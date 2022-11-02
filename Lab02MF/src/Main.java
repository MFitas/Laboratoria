import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        //Zadanie 1
        double first,second,third;

        System.out.println("Rozwiażę dla Ciebie równanie kwadratowe w postaci ax2+bx+c=0");
        System.out.println("Podaj a");
        first= reader.nextDouble();

        System.out.println("Podaj b");
        second= reader.nextDouble();

        System.out.println("Podaj c");
        third= reader.nextDouble();

        rownanieKwadratowe(first,second,third);

        //zadanie 2
        System.out.println("Podaj liczbe dla funkcji a(x)");
        var fOdA= reader.nextDouble();
        System.out.println("Wynik: "+funkcjaFOdA(fOdA));

        System.out.println("Podaj liczbe dla funkcji b(x)");
        var fOdB= reader.nextDouble();
        System.out.println("Wynik: "+funkcjaFOdB(fOdB));

        System.out.println("Podaj liczbe dla funkcji c(x)");
        var fOdC= reader.nextDouble();
        System.out.println("Wynik: "+funkcjaFOdC(fOdC));

        //zadanie 3
        System.out.println("Podaj x");
        var x= reader.nextDouble();
        System.out.println("Podaj y");
        var y= reader.nextDouble();
        System.out.println("Podaj z");
        var z= reader.nextDouble();
        sortxyz(x,y,z);

        //zadanie 4
        System.out.println("Czy Pada? tak = y, nie = n");
        var pada = reader.next();

        System.out.println("Czy jest Autobus? tak = y, nie = n");
        var autobus = reader.next();
        logic(pada, autobus);

        //zadanie 5
        System.out.println("Czy Dostałeś premię? tak = y, nie = n");
        var premia = reader.next();

        System.out.println("Czy jest zniżka na samochód? tak = y, nie = n"); //todo fix it
        var znizka = reader.next();
        System.out.println(logic1(premia,znizka));

        // zadanie 6
        System.out.println("Wprowadz pierwsza liczbe");
        var a =reader.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        var b =reader.nextDouble();
        System.out.println("Wprowadz znak działania, które chcesz wykonać (+,-,*,/,%)");
        var znak =reader.next();
        if (Objects.equals(znak, "/") && b == 0)
            System.out.println("Nie wolno dzielić przez zero");
        switch (znak) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            case "%" -> System.out.println(a % b);
        }
    }

    private static String logic1(String premia, String znizka)
    {
        var isDiscount = Objects.equals(znizka, "y");
        var isBonus = Objects.equals(premia, "y");

        if (!(isBonus||isDiscount))
            return "Zakup samochód trzeba odłożyć na później..., Zniżki na samochód nie ma";
        if (!(!isBonus||!isDiscount))
            return "Możesz kupić samochód";
        else
            return "Możesz kupić samochód !”, „Zniżki na samochód nie ma";
    }

    private static void logic(String pada, String autobus) {
        if (Objects.equals(pada, "y") && Objects.equals(autobus, "y"))
            System.out.println("Weź parasol, Dostaniesz się na uczelnie");
        if (Objects.equals(pada, "y") && Objects.equals(autobus, "n"))
            System.out.println("Nie dostaniesz się na uczelnie");
        if (Objects.equals(pada, "n") && Objects.equals(autobus, "n"))
            System.out.println("Nie dostaniesz się na uczelnie");
        if (Objects.equals(pada, "n") && Objects.equals(autobus, "y"))
            System.out.println("Dostaniesz się na uczelnię, Miłego dnia i pięknej pogody.");
    }

    private static void sortxyz(double x, double y, double z)
    {
        double max = Math.max(x, Math.max(y, z));
        double min = Math.min(x, Math.min(y, z));
        double mid = x + y + z - max - min;
        System.out.println("W kolejności: "+ min+" "+ mid+" "+ max+" ");
    }

    private static double funkcjaFOdA(double fOdA) {
        if (fOdA>0)
            return fOdA*2;
        else if (fOdA==0)
            return 0;
        else
            return fOdA*(-3);
    }

    private static double funkcjaFOdB(double fOdB) {
        return fOdB<1 ? fOdB : fOdB*fOdB;
    }

    private static double funkcjaFOdC(double fOdC)
    {
        if (fOdC>2)
            return fOdC+2;
        else if (fOdC==2)
            return 8;
        else
            return fOdC-4;
    }

    private static void rownanieKwadratowe(double a, double b, double c)
    {
        var delta = (b*b) - (4*a*c);
        if (delta< 0)
            System.out.println("Równanie nie ma rozwiązań");
        else if (delta==0)
            System.out.println("Równanie ma jedno rozwiązanie. x="+ -b/(2*a));
        else{
            var x1 = (-b-Math.sqrt(delta))/(2*a);
            var x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("Równanie ma dwa rozwiązania: x1="+ x1 + " x2=" + x2);
        }

    }
}