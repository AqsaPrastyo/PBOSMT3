package main.java.com.mycompany.PboTeori10;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    
    public  getGaji() {
        return gaji + tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }
}
