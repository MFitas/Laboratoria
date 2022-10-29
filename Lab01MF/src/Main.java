import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        var reader = new Scanner(System.in);
        //zadanie 1 lab01

        System.out.println(getNameAndAge());

        //zadanie 2

        System.out.println("podaj dwie liczby");
        makeSomeCalculationsForTwoProvidedDigits();

        //zadanie 3
        System.out.println("podaj liczbę, sprawdzę czy jest parzysta");
        var number = reader.nextInt();
        if (isEvenNum(number)) {
            System.out.println("parzysta");
        }
        else {
            System.out.println("nieparzysta");
        }

        //zadanie 4

        System.out.println("podaj liczbę sprawdzę czy jest podzielna przez 3 i 5");
        var isDiv = reader.nextInt();
        if (isDiv(isDiv)) {
            System.out.println("jest podzielna przez 3 i 5");
        }
        else {
            System.out.println("nie jest podzielna przez 3 i 5");
        }

        //zadanie 5
        System.out.println("podaj liczbę podam 3 potęgę");
        var power = reader.nextDouble();
        System.out.println(thirdPower(power));

        //zadanie 6
        System.out.println("podaj liczbę wyciagne pierwiastek");
        var square = reader.nextDouble();
        if (square>0)
            System.out.println("pierwiastek to: "+squareMethod(square));
        else
            System.out.println("liczba ujemna nie ma pierwiastka");

        //zadanie 7
        System.out.println("podaj 2 liczby, wylosuję 3 liczby z ich przedziału i sprawdzę" +
                " czy na ich podstawie można zbudować trójkąt prostokątny");
        var floorRange = reader.nextInt();
        var maxRange= reader.nextInt();
        int a,b,c;
        a = Randomize(maxRange, floorRange);
        b = Randomize(maxRange, floorRange);
        c = Randomize(maxRange, floorRange);
        if (rectangularTriangle(a, b, c))
            System.out.println("Wylosowane liczby: "+a+","+b+","+c+ "da się zbudować trójkąt prostokątny");
        else
            System.out.println("Wylosowane liczby: "+a+","+b+","+c+" nie da się zbudować trójkąta prostokątnego");

    }

    private static int Randomize(int maxRange, int floorRange) {
        return (int) Math.floor(Math.random()*(maxRange-floorRange+1)+floorRange);
    }

    private static boolean rectangularTriangle(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
    }

    private static double squareMethod(double power) {
        return Math.sqrt(power);
    }

    private static double thirdPower(double power) {
        return Math.pow(power,3);
    }

    private static boolean isDiv(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    private static boolean isEvenNum(int number) {
        return number % 2 == 0;
    }

    private static void makeSomeCalculationsForTwoProvidedDigits() {
        var reader = new Scanner(System.in);
        var a = reader.nextInt();
        var b = reader.nextInt();
        writeCalculations(a, b);
    }

    private static void writeCalculations(int a, int b) {
        var roznica = a-b;
        var suma = a+b;
        var iloczyn = a*b;
        System.out.println("różnica: "+ roznica+ " suma: " +suma+ " iloczyn: " + iloczyn);
    }

    private static String getNameAndAge() {
        int age = 32;
        String name = "Mateusz";
        return "Age: "+ age + " Name: " + name;
    }
}