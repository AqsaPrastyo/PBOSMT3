package main.java.com.mycompany.PraktekPBO1;

public class Handphone {
  String processor = "Snapdragon";
  int ram = 2000;
  String brand = "Xiaomi";
  double screenSize = 6.5;
  boolean isOn = false;

  void turnOn() {
      System.out.println("Handphone is turning on...");
      ram -= 100;
      isOn = true;
  }

  void ramInformation() {
      System.out.println("RAM yang digunakan sebesar " + ram + " MB");
  }

  void showSystemInformation() {
      System.out.println("Jenis processor: " + processor + ", Brand: " + brand);
  }

  void showScreenSize() {
      System.out.println("Ukuran layar: " + screenSize + " inch");
  }

  void turnOff() {
      isOn = false;
      System.out.println("Handphone dimatikan.");
  }
}

