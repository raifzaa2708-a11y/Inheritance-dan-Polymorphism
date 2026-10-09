public class Hasil {
    public static void main(String[] args) {
        System.out.println("=== TEST LATIHAN 1 ===");
        Bentuk bentukUji = new Bentuk("Merah");
        bentukUji.printInfo();

        BujurSangkar bs = new BujurSangkar(4.0, "Biru");
        bs.printInfo();

        System.out.println("\n=== TEST LATIHAN 2 ===");
        Lingkaran lingkaran = new Lingkaran(7.0, "Kuning");
        lingkaran.printInfo();

        System.out.println("\n=== TEST LATIHAN 3 ===");
        Silinder silinder = new Silinder(10.0, 7.0, "Hijau");
        silinder.printInfo();
    }
}