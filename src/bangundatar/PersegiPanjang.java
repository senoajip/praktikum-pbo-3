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
public class PersegiPanjang extends Bangundatar{
    protected double panjang,lebar;

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    @Override
    public double Luas(){
        return panjang*lebar;
    }

    public double Keliling(){
        return 2*(panjang+lebar);
    }
}
