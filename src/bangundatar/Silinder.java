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
public class Silinder extends Lingkaran {
    protected double tinggi;

    @Override
    public double getPI(){
        return PI;
    }

    @Override
    public double getR(){
        return r;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double volume(){
        return (double) (PI * Math.pow(this.r, 2)*tinggi);
    }
}
