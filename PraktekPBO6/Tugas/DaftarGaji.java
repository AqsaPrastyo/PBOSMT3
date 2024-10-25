package main.java.com.mycompany.PraktekPBO6.Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index = 0;
    
    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }
    
    public void addPegawai(Pegawai p) {
        if(index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        } else {
            System.out.println("Daftar gaji penuh!");
        }
    }
    
    public void printSemuaGaji() {
        for (Pegawai p : listPegawai) {
            if (p != null) {
                System.out.println("Nama: " + p.getNama() + ", Gaji: " + p.getGaji());
            }
        }
    }
}
