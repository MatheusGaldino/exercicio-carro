
package javaapplication1;


public class TesteMotor {
    public static void main(String args[]){
        Carro c1 = new Carro();
        System.out.println(c1.Motor.giros());
        System.out.println(c1.estaligado());
        c1.ligar();
        System.out.println(c1.estaligado());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.Motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.Motor.giros());
        System.out.println(c1.estaligado());
    }
}
