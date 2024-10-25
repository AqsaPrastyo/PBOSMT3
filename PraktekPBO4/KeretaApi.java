package main.java.com.mycompany.PraktekPBO4;

public class KeretaApi {

    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    // Konstruktor untuk 3 parameter (tanpa asisten)
    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = null; // Asisten tidak diberikan
    }

    // Konstruktor untuk 4 parameter (dengan asisten)
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    // Method info() untuk menampilkan informasi kereta api
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        if (this.asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        } else {
            info += "Asisten: Tidak ada\n"; // Jika asisten tidak diberikan
        }
        return info;
    }
  }
