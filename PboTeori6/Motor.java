package main.java.com.mycompany.PboTeori6;

public class Motor extends Kendaraan {
    protected String jenisMesin;

    public Motor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan);
        this.jenisMesin = jenisMesin;
    }

    public void standarkan() {
        System.out.println(nama + " telah di-standarkan.");
    }
}
