public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = Math.PI; // PHI sebagai konstanta class
//LATIHAN-2
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    //menghitung luas lingkaran (PHI * r * r)
    public double hitungLuas() {
        return PHI * radius * radius;
    }

    //override printInfo
    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + getWarna() + ", luas = " + hitungLuas());
    }
}