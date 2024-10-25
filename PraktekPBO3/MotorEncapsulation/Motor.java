package main.java.com.mycompany.PraktekPBO3.MotorEncapsulation;

/**
 * Motor
 */
public class Motor {
  public int kecepatan = 0;
  public boolean kontakON = false;

  public void nyalakanMesin(){
    kontakON = true;
  }

  public void matikaMesin(){
    kontakON = false;
    kecepatan = 0;
  }

  public void tambahKecepatan(){
    if (kontakON == true) {
      kecepatan += 5;
    } else {
      System.out.println("Kecepatan tidak bisa bertambah karena Mesin OFF!");
    }
  }

  public void kurangiKecepatan(){
    if (kontakON == true) {
      kecepatan -= 5;
    } else {
      System.out.println("Kecepatan tidak bisa berkurang karena Mesin OFF!");
    }
  }

  public void printStatus(){
    if (kontakON == true) {
      System.out.println("Kontak On");
    } else {
      System.out.println("Kontak OFF");
    }
    System.out.println("Kecepatan " + kecepatan+"\n");
  }
  


}