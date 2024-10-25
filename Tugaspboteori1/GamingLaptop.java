package main.java.com.mycompany.Tugaspboteori;

public class GamingLaptop extends Laptop {
    private String gpu;
    
    public void gpu(String newvalue) {
        gpu = newvalue;
    }
    
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("GPU: " + gpu);
    }
}

