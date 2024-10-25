package main.java.com.mycompany.PraktekPBO3;

/**
 * Anggotas
 */
public class Anggotas {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Constructor
    public Anggotas(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; 
    }
    public String getNama() {
        return nama;
    }
    public int getLimitPinjaman() {
        return limitPinjaman;
    }
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Berhasil meminjam: " + jumlah);
        }
    }
    public void angsur(int jumlah) {
        int minimalAngsuran = (int) (0.1 * jumlahPinjaman);

        if (jumlah < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0; 
            }
            System.out.println("Berhasil mengangsur: " + jumlah);
        }
    }
}
