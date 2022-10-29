import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //zadanie 1
        var reader = new Scanner(System.in);
        int n;
        System.out.println("Wprowadź liczbę studentów");
        n = reader.nextInt();
        ArrayList<Integer> pointList = new ArrayList<>();
        var i  =0;
        while (i<n){
            System.out.println("Wprowadz liczbę punktów dla studenta nr."+(i+1));
            pointList.add(reader.nextInt());
            i++;
        }
        double sredniaPunktow = 0;
        while (i>0)
        {
            sredniaPunktow += pointList.get(--i);
        }
        System.out.println("Srednia puknktów dla wprowadzonych studentów to: "+(sredniaPunktow/pointList.size()));


        //zadanie 2
        int j = 0;
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        while (j<10){
            var number = reader.nextInt();
            if (number<0)
                negativeNumbers.add(number);
            positiveNumbers.add(number);
            j++;
        }

        var negativeNumbersSum = 0;
        for (int number: negativeNumbers)
        {
            negativeNumbersSum +=number;
        }

        var positiveNumbersSum = 0;
        for (int number: negativeNumbers)
        {
            positiveNumbersSum +=number;
        }
        System.out.println("Ilość podanych liczb dodatnich: "+positiveNumbers.size()+" Ich suma: "+positiveNumbersSum
                +"\nIlość podanych liczb ujemnych:  "+negativeNumbers.size()+" Ich suma: "+ negativeNumbersSum );

        //zadanie 3 i 4
        System.out.println("podaj długość ciagu");
        var m =reader.nextInt();
        int k =0;
        int sumOfEvenNumbers = 0;
        while (k<m){
          var x = generateNumber();
            if (x%2==0)
                sumOfEvenNumbers += x;
            k++;
        }
        System.out.println("Suma parzystych liczb w ciagu to: "+ sumOfEvenNumbers);

        //zadanie 5


    }

    private static int generateNumber()
    {
        var min = -10;
        var max = 45;
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }
}