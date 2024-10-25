package main.java.com.mycompany.UTS_Praktikum;

class ElectronicDevice {
    public void deviceInfo() {
        System.out.println("Ini adalah perangkat elektronik.");
    }
}

class Tablet extends ElectronicDevice {
    public void tabletFeature() {
        System.out.println("Ini adalah fitur Tablet.");
    }
}

class Laptop extends ElectronicDevice {
    public void laptopFeature() {
        System.out.println("Ini adalah fitur Laptop.");
    }
}

public class CyclicInheritanceSolution {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.laptopFeature();
        
        Tablet tablet = new Tablet();
        tablet.tabletFeature();
    }
}


