package main.java.com.mycompany.PraktekPBO3.MotorEncapsulation;

/**
 * MotorDemo
 */
public class MotorDemo {
  public static void main(String[] args) {
    
    Motor motor = new Motor();
    motor.printStatus();
    motor.tambahKecepatan();

    motor.nyalakanMesin();
    motor.printStatus();
    
    motor.tambahKecepatan();
    motor.printStatus();

    motor.tambahKecepatan();
    motor.printStatus();
    
    motor.tambahKecepatan();
    motor.printStatus();

    motor.matikaMesin();
    motor.printStatus();

 }
}