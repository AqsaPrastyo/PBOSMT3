package main.java.com.mycompany.PraktekPBO2;

public class demoPeminjaman {
  public static void main(String[] args) {
   
    Peminjam peminjam = new Peminjam("001", "Rich Brian", "Baldurs Gate 3", 50000, 3);

    peminjam.hasilPeminjaman();

   
    peminjam.hitungTotal();
}
}
