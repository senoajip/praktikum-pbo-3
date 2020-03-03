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
public class Kubus extends Persegi {
    @Override
    public double getSisi(){
        return sisi;
    }
    @Override
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double volume(){
        return (float) (Math.pow(this.sisi, 3));
    }
}
