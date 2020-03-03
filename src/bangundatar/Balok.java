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
public class Balok extends PersegiPanjang{
   protected double tinggi;

   @Override
    public double getPanjang(){
        return panjang;
    }
   @Override
    public double getLebar(){
        return lebar;
    }

    /**
     *
     * @return
     */
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double volume(){
        return panjang*lebar*tinggi;
    } 
}
