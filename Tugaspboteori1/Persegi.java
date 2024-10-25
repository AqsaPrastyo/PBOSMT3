

public class Persegi {
  int sisi = 5;
  int luas = sisi * sisi;
  int keliling = 4 * sisi;

  public Persegi(int sisi, int luas, int keliling) {
    this.sisi = sisi;
    this.luas = sisi * sisi;
    this.keliling = 4 * sisi;
  }

  void gas (){
    System.out.println("Sisi dari persegi: " + sisi + " Luasnya: " + luas + " Kelilingnya: " + keliling);
  }

  public int getSisi() {
    return sisi;
  }

  public int getLuas() {
    return luas;
  }

  public int getKeliling() {
    return keliling;
  }
}
