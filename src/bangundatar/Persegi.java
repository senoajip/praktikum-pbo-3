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
public class Persegi extends Bangundatar {
    protected double sisi;

    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /**
     *
     * @return
     */
    @Override
    public double Luas(){
        return this.sisi * this.sisi;
    }

//    public double Luas(double sisi){
//        return sisi*sisi;
//    }

    @Override
    public double Keliling() {
        return 4*sisi;
    }
}
