package main.java.com.mycompany.PraktekPBO1;

public class Demo {
  public static void main(String[] args) {
      // Instansiasi objek
      Handphone hp = new Handphone();
      MobilSport sportCar = new MobilSport();
      Truck truk = new Truck();
      Gitar gitar = new Gitar();

      // Menerapkan method untuk setiap objek
      System.out.println("=== Handphone ===");
      hp.turnOn();
      hp.ramInformation();
      hp.showSystemInformation();
      hp.showScreenSize();
      hp.turnOff();

      System.out.println("\n=== Mobil Sport ===");
      sportCar.startEngine();
      sportCar.accelerate();
      sportCar.turboBoost();
      sportCar.printInfo();
      sportCar.stopEngine();

      System.out.println("\n=== Truck ===");
      truk.startEngine();
      truk.loadCargo();
      truk.dumpLoad();
      truk.printInfo();
      truk.stopEngine();

      System.out.println("\n=== Gitar ===");
      gitar.play();
      gitar.changeString("Steel");
      gitar.printInfo();
  }
}

