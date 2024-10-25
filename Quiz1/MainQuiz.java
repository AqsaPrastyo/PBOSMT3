package main.java.com.mycompany.Quiz1;

import main.java.com.mycompany.Quiz1.Fakultas;

public class MainQuiz {
  public static void main(String[] args) {
    
    Fakultas teknik = new Fakultas("Teknik", 500, "Dr. Budi");
    Fakultas ekonomi = new Fakultas("Ekonomi", 300, "Dr. Siti");

    
    Kampus universitasA = new Kampus("Universitas A", "Jakarta", "A");

    
    Fakultas[] fakultasArray = { teknik, ekonomi };
    universitasA.tambahFakultas(fakultasArray);

    
    universitasA.cetakProfil();
}  
}
