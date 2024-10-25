/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import main.java.com.mycompany.mavenproject1.SepedaGunung;

/**
 *
 * @author revoa
 */
public class SepedaDemo {
    public static void main(String[] args) {
        
        //buat 2 buah objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        //Panggil method didlam objek sepeda
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantigear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantigear(2);
        spd2.gantigear(3);
        spd2.cetakStatus();  

        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantigear(7);
        spd3.SetTipeSuspensi("Gas suspension");
        spd3.cetakStatus();

    }
}
