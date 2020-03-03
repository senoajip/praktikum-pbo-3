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
public class Segitiga extends Bangundatar{
    private double alas, tinggi;

    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double Luas(){
        return (alas*tinggi)/2;
    }
    @Override
    public double Keliling(){
        return 3*alas;
    }
}
