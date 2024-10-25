

public class kursi {
    String nomor;
    penumpang penumpang;

    public kursi (String nomor, penumpang penumpang){
        this.nomor = nomor;
        this.penumpang = penumpang;
    }

    public kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor (String nomor){
        this.nomor = nomor;
    }
    public void setPenumpang (penumpang penumpang){
        this.penumpang = penumpang;
    }
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }

}
