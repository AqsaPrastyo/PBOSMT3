package main.java.com.mycompany.PboTeori2;

public class Persegi {
  
  public int sisi;

  
  public Persegi(int sisi) {
      this.sisi = sisi;
  }

  
  public void dataPersegi() {
      System.out.println("Sisi Persegi: " + sisi);
  }

  
  public int luasPersegi() {
      return sisi * sisi;
  }

  
  public int kelilingPersegi() {
      return 4 * sisi;
  }

  
  public int getSisi() {
      return sisi;
  }
}
