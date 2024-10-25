package main.java.com.mycompany.UTS1_teoripbo;

public class PegawaiKontrak extends Pegawai implements Bonus {
    double lembur;

    public PegawaiKontrak(String nama, double gaji, double lembur) {
        super(nama, gaji);
        this.lembur = lembur;
    }

    public void info() {
        super.info();
        System.out.println("Bonus Lembur: " + lembur);
    }

    public double totalGaji() {
        return gaji + lembur;
    }

    public double hitungBonus() {
        return lembur * 0.05;
    }
}
