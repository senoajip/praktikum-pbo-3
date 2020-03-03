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
public class Main {
    public static void main(String[] args){

        Persegi persegi = new Persegi();
        persegi.setSisi(4);
        System.out.println("Persegi");
        System.out.println("Sisi\t\t: " + persegi.getSisi());
        System.out.println("Luas\t\t: " + persegi.Luas());
        //System.out.println("Luas Persegi : " + persegi.Luas(10)); // override
        System.out.println("Keliling\t: " + persegi.Keliling());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(14);
        System.out.println("\nLingkaran");
        System.out.println("r\t\t: " + lingkaran.getR());
        System.out.println("Luas\t\t: " + lingkaran.Luas());
        System.out.println("Keliling\t: " + lingkaran.Keliling());


        PersegiPanjang PP = new PersegiPanjang();
        PP.setLebar(6);
        PP.setPanjang(8);
        System.out.println("\nPersegi Panjang");
        System.out.println("Lebar\t\t: " + PP.getLebar());
        System.out.println("Panjang\t\t: " + PP.getPanjang());
        System.out.println("Luas\t\t: " + PP.Luas());
        System.out.println("Keliling\t: " + PP.Keliling());

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(3);
        System.out.println("\nSegitiga");
        System.out.println("Alas\t\t: " + segitiga.getAlas());
        System.out.println("Tinggi\t\t: "+ segitiga.getTinggi());
        System.out.println("Luas\t\t: " + segitiga.Luas());
        System.out.println("Keliling\t: " + segitiga.Keliling());

        Kubus kubus = new Kubus();
        kubus.setSisi(8);
        System.out.println("\nKubus");
        System.out.println("Sisi\t\t: " + kubus.getSisi());
        System.out.println("Volume\t\t: " + kubus.volume());


        Silinder silinder = new Silinder();
        silinder.setR((float)0.5);
        silinder.setTinggi(12);
        System.out.println("\nSilinder");
        System.out.println("Tinggi\t\t: " + silinder.getTinggi());
        System.out.println("r\t\t: " + silinder.getR());
        System.out.println("Volume\t\t: " + silinder.volume());

        Balok balok = new Balok();
        balok.setPanjang(15);
        balok.setLebar(8);
        balok.setTinggi(10);
        System.out.println("\nBalok");
        System.out.println("Panjang\t\t: " + balok.getPanjang());
        System.out.println("Lebar\t\t: " + balok.getLebar());
        System.out.println("Tinggi\t\t: " + balok.getTinggi());
        System.out.println("Volume\t\t: " + balok.volume());
    }
}
