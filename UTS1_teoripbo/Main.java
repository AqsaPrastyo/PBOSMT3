package main.java.com.mycompany.UTS1_teoripbo;

public class Main {
    public static void main(String[] args) {
        // Membuat objek PegawaiTetap
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Budi", 5000000, 1000000);
        System.out.println("Data Pegawai Tetap:");
        pegawaiTetap.info();
        System.out.println("Total Gaji Pegawai Tetap: " + pegawaiTetap.totalGaji());
        System.out.println("Bonus Pegawai Tetap: " + pegawaiTetap.hitungBonus());

        System.out.println();

        // Membuat objek PegawaiKontrak
        PegawaiKontrak pegawaiKontrak = new PegawaiKontrak("Ari", 4000000, 500000);
        System.out.println("Data Pegawai Kontrak:");
        pegawaiKontrak.info();
        System.out.println("Total Gaji Pegawai Kontrak: " + pegawaiKontrak.totalGaji());
        System.out.println("Bonus Pegawai Kontrak: " + pegawaiKontrak.hitungBonus());
    }
}

