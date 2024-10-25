public class RentalKendaraanMain {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota Avanza", 4);
        mobil1.tampilkanInfo();
        System.out.println("Biaya Sewa 3 hari: Rp " + mobil1.hitungBiaya(3));
        System.out.println("Biaya Sewa 2 minggu: Rp " + mobil1.hitungBiaya(2, true));
        
        System.out.println();

        // Membuat objek Motor
        Motor motor1 = new Motor("Honda Vario", false);
        motor1.tampilkanInfo();
        System.out.println("Biaya Sewa 3 hari: Rp " + motor1.hitungBiaya(3));
        System.out.println("Biaya Sewa 2 minggu: Rp " + motor1.hitungBiaya(2, true));
    }
}
