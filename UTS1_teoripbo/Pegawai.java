package main.java.com.mycompany.UTS1_teoripbo;

public class Pegawai {
    protected String nama;
    protected double gaji;  

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public Pegawai() {
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }

    
    public double hitungBonus() {
        return 0; 
    }
}
