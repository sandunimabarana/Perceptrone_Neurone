/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzylogic;

/**
 *
 * @author Ishu
 */
public class NeuronAssignment {
    int x1, x2, x3, x4;
    float totalWeight;
    double w1=0.4;
    double w2=-0.2;
    double w3=-0.3;
    double w4 =0.6;
    double threshold=0.6;
    
    public void Neuron(int x1, int x2, int x3, int x4) {
    this.x1 = x1;
    this.x2 = x2;
    this.x3 = x3;
    this.x4 = x4;
    
    totalWeight=(float) (x1*w1+x2*w2+x3*w3+x4*w4);
    if(totalWeight > threshold){
    System.out.println("x1 x2 x3 x4 out"+ '\n' +x1+ " " + " " +x2+ " "  + " " +x3+" " + " " + " "+x4+ "  1 ");
    
    }else{
    System.out.println("x1 x2 x3 x4 out"+ '\n' +x1+ " " + " " +x2+ " "  + " " +x3+" " + " " + " "+x4+ "  0 ");
    }
  }
     public static void main(String args[]) { 
          NeuronAssignment obj1 = new NeuronAssignment();
          obj1.Neuron(0,0,0,0);
          obj1.Neuron(0,0,0,1);
          obj1.Neuron(0,0,1,0);
          obj1.Neuron(0,0,1,1);
          obj1.Neuron(0,1,0,0);
          obj1.Neuron(0,1,0,1);
          obj1.Neuron(0,1,1,0);
          obj1.Neuron(0,1,1,1);
          obj1.Neuron(1,0,0,0);
          obj1.Neuron(1,0,0,1);
          obj1.Neuron(1,0,1,0);
          obj1.Neuron(1,0,1,1);
          obj1.Neuron(1,1,0,0);
          obj1.Neuron(1,1,0,1);
          obj1.Neuron(1,1,1,0);
          obj1.Neuron(1,1,1,1);
}
}
