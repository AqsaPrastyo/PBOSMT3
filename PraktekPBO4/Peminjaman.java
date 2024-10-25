package main.java.com.mycompany.PraktekPBO4;
public class Peminjaman {
  Buku buku;
  Anggota anggota;
  String tanggalPinjam;
  String tanggalKembali;

  public Peminjaman(Buku buku, Anggota anggota, String tanggalPinjam, String tanggalKembali) {
      this.buku = buku;
      this.anggota = anggota;
      this.tanggalPinjam = tanggalPinjam;
      this.tanggalKembali = tanggalKembali;
  }

  public void tampilkanInfoPeminjaman() {
      System.out.println("Informasi Peminjaman:");
      buku.tampilkanInfoBuku();
      anggota.tampilkanInfoAnggota();
      System.out.println("Tanggal Pinjam: " + tanggalPinjam);
      System.out.println("Tanggal Kembali: " + tanggalKembali);
  }
}
