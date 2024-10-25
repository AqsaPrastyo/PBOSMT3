package main.java.com.mycompany.PraktekPBO4;
public class Buku {
  String judul;
  String pengarang;
  boolean statusTersedia;

  public Buku(String judul, String pengarang, boolean statusTersedia) {
      this.judul = judul;
      this.pengarang = pengarang;
      this.statusTersedia = statusTersedia;
  }

  public void tampilkanInfoBuku() {
      System.out.println("Judul Buku: " + judul);
      System.out.println("Pengarang: " + pengarang);
      System.out.println("Status Tersedia: " + (statusTersedia ? "Tersedia" : "Tidak Tersedia"));
  }

  public void setStatusTersedia(boolean statusTersedia) {
      this.statusTersedia = statusTersedia;
  }
}
