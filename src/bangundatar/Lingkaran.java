/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Acer
 */
public class Lingkaran extends Bangundatar {
    protected final double PI = (float) 3.14;
    protected double r;

    public double getPI(){
        return PI;
    }
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }


     @Override
     public double Luas(){
         return (float) (PI * Math.pow(this.r, 2));
     }

    @Override
    public double Keliling() {
        return (float) (PI*2*r);
    }
}
