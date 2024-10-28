package main.java.com.mycompany.PraktekPBO9.Tugas;

public class Segitiga {
    private int sudut;

    // Method untuk menghitung total sudut jika diberikan satu sudut
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Method untuk menghitung total sudut jika diberikan dua sudut
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Method untuk menghitung keliling jika diberikan tiga sisi
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Method untuk menghitung keliling menggunakan rumus pythagoras jika diberikan dua sisi
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // Contoh penggunaan metode totalSudut dan keliling
        System.out.println("Total sudut (1 sudut): " + segitiga.totalSudut(60));
        System.out.println("Total sudut (2 sudut): " + segitiga.totalSudut(60, 70));
        System.out.println("Keliling (3 sisi): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi): " + segitiga.keliling(3, 4));
    }
}