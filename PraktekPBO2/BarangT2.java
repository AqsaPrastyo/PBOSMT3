package main.java.com.mycompany.PraktekPBO2;


public class BarangT2 {

private String kode;
private String namaBarang;
private int hargaDasar;
private float diskon;


public BarangT2(String kode, String namaBarang, int hargaDasar, float diskon) {
    this.kode = kode;
    this.namaBarang = namaBarang;
    this.hargaDasar = hargaDasar;
    this.diskon = diskon;
}


public int hitungHargaJual() {
    return hargaDasar - (int)(diskon * hargaDasar);
}


public void tampilData() {
    System.out.println("Kode Barang: " + kode);
    System.out.println("Nama Barang: " + namaBarang);
    System.out.println("Harga Dasar: Rp" + hargaDasar);
    System.out.println("Diskon: " + (diskon * 100) + "%");
    System.out.println("Harga Jual: Rp" + hitungHargaJual());
}
  
}

