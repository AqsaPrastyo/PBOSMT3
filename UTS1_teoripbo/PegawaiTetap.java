package main.java.com.mycompany.UTS1_teoripbo;

public class PegawaiTetap extends Pegawai implements Bonus {
    double tunjangan;

    public PegawaiTetap(String nama, double gaji, double tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public void info() {
        super.info();
        System.out.println("Tunjangan Khusus: " + tunjangan);
    }

    public double totalGaji() {
        return gaji + tunjangan;
    }

    public double hitungBonus() {
        return totalGaji() * 0.1;
    }
}

