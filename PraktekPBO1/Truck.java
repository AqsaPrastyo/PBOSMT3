package main.java.com.mycompany.PraktekPBO1;

public class Truck extends Kendaraan {
  int totalMuatan = 0;
  int maxMuatan = 300;

  Truck() {
      this.fuelType = "Diesel";
      this.wheels = 6;
  }

  void loadCargo() {
      totalMuatan += maxMuatan;
      System.out.println("Memuat barang, total muatan sekarang: " + totalMuatan + " kg");
  }

  void dumpLoad() {
      totalMuatan = 0;
      System.out.println("Muatan dibuang. Total muatan: " + totalMuatan + " kg");
  }

  @Override
  void printInfo() {
      super.printInfo();
      System.out.println("Total muatan maksimal: " + maxMuatan + " kg");
  }
}

