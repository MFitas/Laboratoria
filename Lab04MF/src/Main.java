import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //zadanie 1
        double[] numbers = new double[10];

        for (int i=0; i<10;i++)
        {
            double number = randomize();
            numbers[i] = number;
        }
        double sum =0;

        for (double number : numbers)
        {
            sum += number;
        }
        double avg = sum/numbers.length;
        System.out.println("Zadanie 1");
        System.out.println("suma liczb: " + sum + " średnia z liczb: "+ avg);
        System.out.println();


        //zadanie 2
        System.out.println("Zadanie 2");

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int[] dataNieparzysta = {1,2,3,4,5,6,7,8,9,10,11};
        showEverySecondNum(data);
        showEverySecondNum(dataNieparzysta);

        //zadanie 3
        System.out.println("Zadanie 3");

        String[] jakasTablica = {"cos", "cos innego", "jakas wartosc"};

        for (String element: jakasTablica)
        {
            System.out.println(element.toUpperCase());
        }
        System.out.println();

        //zadanie 4
        System.out.println("Zadanie 4");
        System.out.println("wpisz 5 słów");

        var reader = new Scanner(System.in);
        String[] wpisanaTablica = new String[5];
        for (int i = 0; i<5; i++){
            wpisanaTablica[i] = reader.next();
        }
        for (int i=0;i<wpisanaTablica.length;i++)
        {
            char znak;
            StringBuilder nowyString= new StringBuilder();
            for (int j=0;j<wpisanaTablica[i].length();j++)
            {
                znak = wpisanaTablica[i].charAt(j);
                nowyString.insert(0,znak);
            }
            wpisanaTablica[i]=nowyString.toString();
        }

        for (int i= wpisanaTablica.length-1; i >= 0; i--){
            System.out.println(wpisanaTablica[i]);
        }
        System.out.println();

        //zadanie 5
        System.out.println("Zadanie 5");
        System.out.println("wpisz 10 liczb");

        double[] liczbyOdUsera = new double[10];
        for (int i =0; i<10;i++){
           liczbyOdUsera[i] = reader.nextDouble();
        }
        bubbleSort(liczbyOdUsera);
        for (double number : liczbyOdUsera) {
            System.out.print(number+" ");
        }
        System.out.println();

        //zadanie 6
        System.out.println("Zadanie 6");
        System.out.println("wpisz 5 liczb");

        int[] doSilni = new int[5];
        for (int i =0; i<5;i++)
        {
            doSilni[i] = reader.nextInt();
        }
        for (int silnia: doSilni)
        {
            System.out.println(factorial(silnia));
        }
        System.out.println();


        // zadanie 7
        System.out.println("Zadanie 7");

        String[] tab1 = new String[]{"cos","innego","niz","zwykle"};
        String[] tab2 = new String[]{"cos","innego","niz","zwykle"};
        int sanityCheck =0;
        for (int i=0; i< tab1.length;i++)
        {
            if (!tab1[i].equals(tab2[i]))
                sanityCheck++;
        }
        if (sanityCheck == 0)
            System.out.println("tablice sa takie same");
        else
            System.out.println("tablice nie sa takie same");

        System.out.println();


    }
    private static long factorial(long i)
    {
        if (i < 1)
            return 1;
        else
            return i * factorial(i - 1);
    }

    static void bubbleSort(double[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    private static void showEverySecondNum(int[] data) {
        for (int i=0; i<data.length;i++)
        {
            if (i%2==0)
                System.out.println(data[i]);
        }
        System.out.println();

    }
    private static double randomize()
    {
        Random random = new Random();
        return random.nextDouble(100);
    }
}