/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishu
 */
import java.util.Random;

public class Perceptron {

   public static void main(String[] args) {

       //Valores Entradas

       double x1 = 1.4;

       double x2 = -0.33;

 

       //Valores Pesos (aleatorios)

       double w1 = new Random().nextDouble();

       double w2 = new Random().nextDouble();

 

       Neuron n = new Neuron(x1, x2, w1, w2);

 

       System.out.println("Entrada 1 (x1): " + x1);

       System.out.println("Entrada 2 (x2): " + x2);

       System.out.println("Salida 1 (y1) = " + n.getY1());

  }

}
