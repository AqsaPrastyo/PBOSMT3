package main.java.com.mycompany.PraktekPBO6.Tugas;

public class Main {
    public static void main(String[] args) {
       
        DaftarGaji daftarGaji = new DaftarGaji(2);
        
        Pegawai pegawai1 = new Pegawai("123", "Budi", "Yogyakarta");
        Dosen dosen1 = new Dosen("456", "Ayu", "Jakarta");
        
        pegawai1.setGaji(3000000);
        
        dosen1.setSKS(12);
        
        daftarGaji.addPegawai(pegawai1);
        daftarGaji.addPegawai(dosen1);
        
        daftarGaji.printSemuaGaji();
    }
}
