package main.java.com.mycompany.PraktekPBO9.Tugas;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen(); // Polimorfisme dengan referensi kelas induk
        Manusia manusia2 = new Mahasiswa();

        // Dynamic method dispatch
        manusia1.bernafas();
        manusia1.makan(); // Memanggil metode makan() pada kelas Dosen

        manusia2.bernafas();
        manusia2.makan(); // Memanggil metode makan() pada kelas Mahasiswa

        // Casting untuk memanggil metode spesifik dari subkelas
        if (manusia1 instanceof Dosen) {
            ((Dosen) manusia1).lembur();
        }

        if (manusia2 instanceof Mahasiswa) {
            ((Mahasiswa) manusia2).tidur();
        }
    }
}
