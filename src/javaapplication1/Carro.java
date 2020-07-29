
package javaapplication1;


public class Carro {
    motor Motor = new motor();
      void acelerar(){
          Motor.fatorInjecao += 0.4;
      }  
      void frear(){
          if(Motor.fatorInjecao > 0.5){
             Motor.fatorInjecao -= 0.3;
          }
          Motor.fatorInjecao -= 0.3;
      }
      
      void ligar(){
          Motor.ligado = true;
      }
      void desligar(){
          Motor.ligado = false;
      }
      boolean estaligado(){
          return Motor.ligado;
      }
      
    }

