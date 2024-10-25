public class Kendaraan {
    String nama;
    String jenis;

    public Kendaraan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    // Metode untuk menampilkan informasi kendaraan (akan di-overriding)
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Jenis Kendaraan: " + jenis);
    }

    // Overloading metode hitungBiaya berdasarkan jumlah hari
    public double hitungBiaya(int hari) {
        return hari * 50000; // Misal biaya per hari Rp 50.000
    }

    // Overloading metode hitungBiaya berdasarkan jumlah minggu
    public double hitungBiaya(int minggu, boolean isMinggu) {
        return minggu * 300000; // Misal biaya per minggu Rp 300.000
    }
}

