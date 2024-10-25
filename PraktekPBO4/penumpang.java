

public class penumpang {
    private String ktp;
    private String nama;

    public penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    public void settkp(String ktp) {
        this.ktp = ktp;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String gettkp() {
        return ktp;
    }
    public String getnama() {
        return nama;
    }
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }

}
