public class Motor extends Kendaraan {
    boolean isManual;

    public Motor(String nama, boolean isManual) {
        super(nama, "Motor");
        this.isManual = isManual;
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode dari kelas dasar
        System.out.println("Jenis Transmisi: " + (isManual ? "Manual" : "Otomatis"));
    }
}
