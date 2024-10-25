package main.java.com.mycompany.UTS_Praktikum;


interface ElectronicDevice {
    void displayType();
}
class Laptop implements ElectronicDevice {
    public void displayType() {
        System.out.println("Ini adalah Laptop.");
    }
}
class Smartphone implements ElectronicDevice {
    public void displayType() {
        System.out.println("Ini adalah Smartphone.");
    }
}
class HybridDevice implements ElectronicDevice {
    private Laptop laptop = new Laptop();
    private Smartphone smartphone = new Smartphone();

    public void displayType() {
        laptop.displayType();
        smartphone.displayType();
    }
}
public class HybridDeviceSolution {
    public static void main(String[] args) {
        HybridDevice hybrid = new HybridDevice();
        hybrid.displayType();
    }
}
public class HybridDeviceError {
    public static void main(String[] args) {
        HybridDevice hybrid = new HybridDevice();
        hybrid.showType();
    }
}

