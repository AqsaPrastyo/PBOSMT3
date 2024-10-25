package main.java.com.mycompany.PboTeori6;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil("Toyota", 80, "Bensin");
        mobil.bergerak();
        mobil.nyalakanAC();
        mobil.matikanAC();
        mobil.berhenti();

        System.out.println();

        // Membuat objek Motor
        Motor motor = new Motor("Honda", 60, "4-Tak");
        motor.bergerak();
        motor.standarkan();
        motor.berhenti();

        System.out.println();

        // Membuat objek MobilSUV
        MobilSUV mobilSUV = new MobilSUV("Jeep", 70, "Solar", 7, "4WD");
        mobilSUV.bergerak();
        mobilSUV.aktifkanModeOffRoad();
        mobilSUV.berhenti();
    }
}
