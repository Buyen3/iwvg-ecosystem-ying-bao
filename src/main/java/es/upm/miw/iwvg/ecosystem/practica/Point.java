package es.upm.miw.iwvg.ecosystem.practica;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int x, int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(int xyz) {
        this(xyz, xyz, xyz);
    }

    public Point() {
        this(0, 0,0);
    }

    public double module() {
        return Math.sqrt((double) this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double phaseXY() {
        return Math.atan((double) this.y / this.x);
    }
    public double phaseXZ() {
        return Math.atan((double) this.z / this.x);
    }
    public double phaseYZ() {
        return Math.atan((double) this.z / this.y);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
        this.z -= origin.getZ();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() { return this.z; }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}