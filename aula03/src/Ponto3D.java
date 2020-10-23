public class Ponto3D {
    private int x;
    private int y;
    private int z;

    public Ponto3D(){
        this.x=0;
        this.y=0;
        this.z=0;
    }

    public Ponto3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Ponto3D = [" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ']';
    }
}
