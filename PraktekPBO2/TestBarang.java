package main.java.com.mycompany.PraktekPBO2;

public class TestBarang {
  public static void main(String[] args) {
    Barang brg1 = new Barang();
    brg1.namaBrg ="pensil";
    brg1.jenisBrg="ATK";
    brg1.stok=10;

    System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
  }
}