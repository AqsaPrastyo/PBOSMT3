package main.java.com.mycompany.PraktekPBO3.KoperasiGetterSetter;

/**
 * KoperasiDemo
 */
public class KoperasiDemo {

  public static void main(String[] args) {
    anggota nasabah1 = new anggota("Iwan", "Jalan Mawar");
    System.out.println("Simpanan " +nasabah1.getNama()+ " :Rp " + nasabah1.getSimpanan());
    nasabah1.setNama ("Iwan Setiawan");
    nasabah1.setAlamat("Jalan Sukarno Hatta no 10");
    nasabah1.setor(100000);
    System.out.println("Simpanan "+nasabah1.getNama()+" Rp "+ nasabah1.getSimpanan());
    
    nasabah1.pinjam (5000);
 
    System.out.println("Simpanan "+nasabah1.getNama()+" Rp "+ nasabah1.getSimpanan());
    }
}
