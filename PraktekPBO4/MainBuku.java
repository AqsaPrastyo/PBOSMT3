package main.java.com.mycompany.PraktekPBO4;

public class MainBuku {
  public static void main(String[] args) {
    Buku buku1 = new Buku("Pemrograman Java", "Budi Raharjo", true);
    Anggota anggota1 = new Anggota("Aulia", 12345);
    Petugas petugas1 = new Petugas("Pak Dedi", 67890);
    Peminjaman peminjaman1 = new Peminjaman(buku1, anggota1, "01-09-2024", "08-09-2024");

    System.out.println("=== Sistem Peminjaman Buku ===");
    peminjaman1.tampilkanInfoPeminjaman();
    petugas1.tampilkanInfoPetugas();
}
}
