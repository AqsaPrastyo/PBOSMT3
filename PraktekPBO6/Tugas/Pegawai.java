package main.java.com.mycompany.PraktekPBO6.Tugas;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;
    protected int gaji;  
    
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.gaji = 0;  
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public int getGaji() {
        return this.gaji;  
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;  
    }
}

