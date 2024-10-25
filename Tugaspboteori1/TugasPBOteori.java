package main.java.com.mycompany.Tugaspboteori;


public class TugasPBOteori {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        GamingLaptop laptop2 = new GamingLaptop(); 
  
        laptop1.merk("ASUS");
        laptop1.model("ZenBook");
        laptop1.prosesor("Intel Core i7");
        laptop1.ram(16);
        laptop1.storage(512);
        laptop1.upgradeStorage(512);
        laptop1.turunkanStorage(256);
        laptop1.cetak();
        
        laptop2.merk("MSI");
        laptop2.model("GE66 Raider");
        laptop2.prosesor("Intel Core i9");
        laptop2.ram(32);
        laptop2.storage(1024);
        laptop2.upgradeStorage(1024);
        laptop2.turunkanStorage(512);
        laptop2.gpu("NVIDIA RTX 3080");
        laptop2.cetak();
    }
}

