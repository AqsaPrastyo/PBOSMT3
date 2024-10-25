package main.java.com.mycompany.PraktekPBO3;

/**
 * TestKoperasi
 */
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Anggotas donny = new Anggotas("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMasukkan jumlah uang yang ingin dipinjam:");
        int jumlahPinjam = input.nextInt();
        donny.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMasukkan jumlah uang yang ingin dipinjam lagi:");
        jumlahPinjam = input.nextInt();
        donny.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMasukkan jumlah angsuran yang ingin dibayar:");
        int jumlahAngsur = input.nextInt();
        donny.angsur(jumlahAngsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("\nMasukkan jumlah angsuran yang ingin dibayar lagi:");
        jumlahAngsur = input.nextInt();
        donny.angsur(jumlahAngsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        input.close();
    }
}

