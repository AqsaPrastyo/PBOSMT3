

import java.lang.reflect.Array;

public class gerbong {
    private String kode;
    private kursi[] arrayKursi;

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new kursi(String.valueOf(i + 1));
        }
    }
    public gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new kursi[jumlah];
        this.initKursi();
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    public void setPenumpang(penumpang penumpang, int nomor) {
        if (penumpang == null){
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
            System.out.println("Kursi sudah diambil");
    }

}
