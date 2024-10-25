package main.java.com.mycompany.PboTeori2;

public class testPersegi {
  public static void main(String[] args) {
    
    Persegi persegi = new Persegi(4);

    
    persegi.dataPersegi();

    
    System.out.println("Luas Persegi: " + persegi.luasPersegi());

    
    System.out.println("Keliling Persegi: " + persegi.kelilingPersegi());

    
    System.out.println("Nilai sisi: " + persegi.getSisi());
}
}
