package main.java.com.mycompany.PraktekPBO1;

public class Gitar {
  int senar = 6;
  String jenisSenar = "Nylon";
  String bodyMaterial = "Mahogany";
  String brand = "Yamaha";

  void play() {
      System.out.println("Memainkan gitar dengan " + senar + " senar.");
  }

  void changeString(String newSenar) {
      jenisSenar = newSenar;
      System.out.println("Senar diganti dengan jenis: " + jenisSenar);
  }

  void printInfo() {
      System.out.println("Brand: " + brand + ", Body Material: " + bodyMaterial);
  }
}

