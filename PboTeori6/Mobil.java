package main.java.com.mycompany.PboTeori6;

public class Mobil extends Kendaraan {
    protected String tipeBahanBakar;

    public Mobil(String nama, int kecepatan, String tipeBahanBakar) {
        super(nama, kecepatan);
        this.tipeBahanBakar = tipeBahanBakar;
    }

    public void nyalakanAC() {
        System.out.println("AC pada " + nama + " telah dinyalakan.");
    }

    public void matikanAC() {
        System.out.println("AC pada " + nama + " telah dimatikan.");
    }
}
