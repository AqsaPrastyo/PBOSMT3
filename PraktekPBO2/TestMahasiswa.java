package main.java.com.mycompany.PraktekPBO2;

public class TestMahasiswa {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.nim=101;
    mhs1.nama="Lestari";
    mhs1.alamat="Jl Vinolia No 1A";
    mhs1.kelas="1A";
    mhs1.tampilBiodata();

    Mahasiswa mhs2 = new Mahasiswa();
    mhs2.nim = 102;
    mhs2.nama = "Budi";
    mhs2.alamat = "Jl Anggrek No 5";
    mhs2.kelas = "1B";
    mhs2.tampilBiodata();

    Mahasiswa mhs3 = new Mahasiswa();
    mhs3.nim = 103;
    mhs3.nama = "Siti";
    mhs3.alamat = "Jl Melati No 2";
    mhs3.kelas = "1C";
    mhs3.tampilBiodata();
  }
}
