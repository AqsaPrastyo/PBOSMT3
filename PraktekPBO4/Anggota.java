package main.java.com.mycompany.PraktekPBO4;

public class Anggota {
  String nama;
  int idAnggota;

  public Anggota(String nama, int idAnggota) {
      this.nama = nama;
      this.idAnggota = idAnggota;
  }

  public void tampilkanInfoAnggota() {
      System.out.println("Nama Anggota: " + nama);
      System.out.println("ID Anggota: " + idAnggota);
  }
}
