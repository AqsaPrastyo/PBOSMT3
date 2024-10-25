package main.java.com.mycompany.PraktekPBO2;

public class Peminjam {

  private String id;
  private String nama;
  private String namaGame;
  private int harga;
  private int durasi;

  public Peminjam(String id, String nama, String namaGame, int harga, int durasi) {
      this.id = id;
      this.nama = nama;
      this.namaGame = namaGame;
      this.harga = harga;
      this.durasi = durasi;
  }

  public void hitungTotal() {
      int total = harga * durasi;
      System.out.println("Total harga yang harus dibayar: " + total);
  }


  public void hasilPeminjaman() {
      System.out.println("ID Peminjam: " + id);
      System.out.println("Nama Peminjam: " + nama);
      System.out.println("Nama Game: " + namaGame);
      System.out.println("Harga per hari: " + harga);
      System.out.println("Durasi peminjaman: " + durasi + " hari");
  }
}
