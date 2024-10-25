package main.java.com.mycompany.PraktekPBO4;

public class Petugas {
  String namaPetugas;
  int idPetugas;

  public Petugas(String namaPetugas, int idPetugas) {
      this.namaPetugas = namaPetugas;
      this.idPetugas = idPetugas;
  }

  public void tampilkanInfoPetugas() {
      System.out.println("Nama Petugas: " + namaPetugas);
      System.out.println("ID Petugas: " + idPetugas);
  }
}
