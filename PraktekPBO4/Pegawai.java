package main.java.com.mycompany.PraktekPBO4;

/**
 * Pegawai
 */
public class Pegawai {

  private String nip;
  private String nama;

  // Constructor with parameters
  public Pegawai(String nip, String nama) {
      this.nip = nip;
      this.nama = nama;
  }

  // Setters and getters
  public void setNip(String nip) {
      this.nip = nip;
  }

  public String getNip() {
      return nip;
  }

  public void setNama(String nama) {
      this.nama = nama;
  }

  public String getNama() {
      return nama;
  }

  // Info method
  public String info() {
      String info = "";
      info += "Nip: " + this.nip + "\n";
      info += "Nama: " + this.nama + "\n";
      return info;
  }
}