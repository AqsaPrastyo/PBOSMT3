package main.java.com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Sepeda;

public class SepedaGunung extends Sepeda {
  
private String tipeSuspensi;

public void SetTipeSuspensi(String newValue){
  tipeSuspensi = newValue;
}

public void cetakStatus(){
  super.cetakStatus();
  System.out.println("Tipe suspensi " + tipeSuspensi);
}


}
