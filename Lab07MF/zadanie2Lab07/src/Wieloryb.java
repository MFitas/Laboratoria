public class Wieloryb extends Ryba
{

    @Override
    public void plyn() {
        System.out.println("Plyne!");
    }

    @Override
    public void wynurz() {
        System.out.println("wynurzam sie!");
    }

    @Override
    public void zanurz() {
        System.out.println("zanurzam sie!");
    }

    @Override
    public void wydalaj() {
        System.out.println("wydalam!");
    }

    @Override
    public void jedz() {
        System.out.println("jem!");
    }

    @Override
    public void lec() {
        throw new IllegalArgumentException("nie umiem latac!");
    }

    @Override
    public void wyladuj() {
        throw new IllegalArgumentException("nie umiem latac i lądować");
    }
}
