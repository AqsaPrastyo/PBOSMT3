package main.java.com.mycompany.PraktekPBO1;

public class Kendaraan {
  String fuelType;
  int wheels;

  void startEngine() {
      System.out.println("Mesin dinyalakan");
  }

  void stopEngine() {
      System.out.println("Mesin dimatikan");
  }

  void printInfo() {
      System.out.println("Tipe bahan bakar: " + fuelType + ", Jumlah roda: " + wheels);
  }
}

