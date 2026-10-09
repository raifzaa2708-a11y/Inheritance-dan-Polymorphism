public class BujurSangkar extends Bentuk {
    private double sisi;
//LATIHAN-1 
    public BujurSangkar(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //menghitung luas bujur sangkar (sisi * sisi)
    public double hitungLuas() {
        return sisi * sisi;
    }

    //Override printInfo
    @Override
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + getWarna() + ", luas = " + hitungLuas());
    }
}