public class Silinder extends Lingkaran {
    private double tinggi;
//LATIHAN-3
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    //menghitung volume silinder (Luas Alas * Tinggi)
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    //override printInfo
    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + getWarna() + ", volume = " + hitungVolume());
    }
}