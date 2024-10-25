package main.java.com.mycompany.PraktekPBO1;

public class MobilSport extends Kendaraan {
  int topSpeed = 200;
  String jenisMesin = "Toyota";
  String color = "Merah";
  String model = "Coupe";

  MobilSport() {
      this.fuelType = "Bensin";
      this.wheels = 4;
  }

  void accelerate() {
      System.out.println("Kecepatan Anda: " + topSpeed + " km/h");
  }

  void turboBoost() {
      System.out.println("Turbo activated! Speed increased to " + (topSpeed + 50) + " km/h");
  }


  void printInfo() {
      super.printInfo();
      System.out.println("Model: " + model + ", Mesin: " + jenisMesin + ", Warna: " + color);
  }
}

