public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void bergerak() {
        System.out.println(nama + " bergerak dengan kecepatan " + kecepatan + " km/h.");
    }

    public void berhenti() {
        System.out.println(nama + " telah berhenti.");
    }
}
