public class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String nama, int jumlahPintu) {
        super(nama, "Mobil");
        this.jumlahPintu = jumlahPintu;
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode dari kelas dasar
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
