package main.java.com.mycompany.Tugaspboteori;

public class Laptop {
    private String merk;
    private String model;
    private String prosesor;
    private int ram;
    private int storage;
    
    public void merk(String newvalue) {
        merk = newvalue;
    }
    
    public void model(String newvalue) {
        model = newvalue;
    }
    
    public void prosesor(String newvalue) {
        prosesor = newvalue;
    }
    
    public void ram(int newvalue) {
        ram = newvalue;
    }
    
    public void storage(int newvalue) {
        storage = newvalue;
    }
    
    public void upgradeStorage(int increment) {
        storage = storage + increment;
    }
    
    public void turunkanStorage(int decrement) {
        storage = storage - decrement;
    }
    
    public void cetak() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }
}

