import java.util.Scanner;

public class Samochod
{
    String Marka, Model, Nadwozie, Kolor;
    int RokProdukcji;
    int Przebieg;



    public Samochod()
    {
        var scanner = new Scanner(System.in);
        Marka = scanner.next();
        Model = scanner.next();
        Nadwozie = scanner.next();
        Kolor = scanner.next();
        RokProdukcji = scanner.nextInt();
        setPrzebieg(scanner.nextInt());
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        Marka = marka;
        Model = model;
        Nadwozie = nadwozie;
        Kolor = kolor;
        RokProdukcji = rokProdukcji;
        Przebieg = przebieg;
    }
    public void setPrzebieg(int przebieg){
        if (przebieg<0)
            throw new IllegalArgumentException("Przebiegu nie da sie cofnac ponizej zera ;)");
        this.Przebieg=przebieg;
    }

    public void opis(){
        System.out.println("Parametry Samochodu: "+Marka+" "+Model+" "+Nadwozie+" "+Kolor+" "+RokProdukcji+" "+Przebieg);
    }
}
