public class Ponto2D {
    private int x;
    private int y;

    public Ponto2D(){
        this.x=0;
        this.y=0;
    }

    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean comparaXcom0(){
        if(this.x==0){
            return true;
        } else{
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto2D = [" +
                "x = " + x +
                ", y = " + y +
                ']';
    }
}
