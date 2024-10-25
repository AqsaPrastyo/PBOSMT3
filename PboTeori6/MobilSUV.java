package main.java.com.mycompany.PboTeori6;

public class MobilSUV extends Mobil {
    private int kapasitasPenumpang;
    private String jenisPenggerak;

    public MobilSUV(String nama, int kecepatan, String tipeBahanBakar, int kapasitasPenumpang, String jenisPenggerak) {
        super(nama, kecepatan, tipeBahanBakar);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.jenisPenggerak = jenisPenggerak;
    }

    public void aktifkanModeOffRoad() {
        System.out.println(nama + " telah mengaktifkan mode off-road.");
    }
}
