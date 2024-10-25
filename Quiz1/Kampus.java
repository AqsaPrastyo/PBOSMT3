package main.java.com.mycompany.Quiz1;

public class Kampus {
  private String namaKampus;
    private String lokasiKampus;
    private String akreditasi;
    private Fakultas[] fakultasList;

    public Kampus(String namaKampus, String lokasiKampus, String akreditasi) {
        this.namaKampus = namaKampus;
        this.lokasiKampus = lokasiKampus;
        this.akreditasi = akreditasi;
    }

    public void tambahFakultas(Fakultas[] fakultasList) {
        this.fakultasList = fakultasList;
    }

    public void cetakProfil() {
        System.out.println("Nama Kampus: " + namaKampus);
        System.out.println("Lokasi: " + lokasiKampus);
        System.out.println("Akreditasi: " + akreditasi);
        System.out.println("Daftar Fakultas:");
        for (Fakultas fakultas : fakultasList) {
            fakultas.cetakFakultas();
        }
    }
}
