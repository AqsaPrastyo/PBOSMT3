package main.java.com.mycompany.PraktekPBO4;

/**
 * MainPertanyaan
 */
public class MainPertanyaan {

  public static void main(String[] args) {
    Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
System.out.println(keretaApi.info());

  }
}