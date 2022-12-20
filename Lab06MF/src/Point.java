public class Point
{
    int x,y;

    public Point() {
        x= 0;
        y=0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void zeruj(){
        x=0;
        y=0;
    }
    public String opis(){
        return  "x= " + x + ", " + " y= " + y;
    }
    public void przesun(int x, int y){
        this.x = this.x+x;
        this.y = this.y+y;
    }

}
