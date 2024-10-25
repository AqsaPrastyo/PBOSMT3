package main.java.com.mycompany.Quiz1;

public class Fakultas {
  private String namaFakultas;
    private int jumlahMahasiswa;
    private String dekan;

    public Fakultas(String namaFakultas, int jumlahMahasiswa, String dekan) {
        this.namaFakultas = namaFakultas;
        this.jumlahMahasiswa = jumlahMahasiswa;
        this.dekan = dekan;
    }

    public void cetakFakultas() {
        System.out.println("Nama Fakultas: " + namaFakultas);
        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
        System.out.println("Dekan: " + dekan);
        System.out.println("------------------------");
    }
}
