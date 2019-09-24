/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TvSharp objTvSharp = new TvSharp(14);
        TvPhilips objTvPhilips = new TvPhilips(32);
        TvTCL objTvTCL = new TvTCL(60);
        
        objTvPhilips.ligar();
        //objTvSharp.ligar();
        System.out.print("TvPhilips - modelo "+objTvPhilips.MODELO+" está ");
        System.out.println(objTvPhilips.isLigada() ?"ligada\n\n" : "desligada");
        
        objTvTCL.ligar();
        System.out.print("TvTCL - modelo "+objTvTCL.MODELO+" está ");
        System.out.println(objTvTCL.isLigada() ?"ligada" : "desligada");
        
        System.out.println("Desligando TV modelo "+objTvTCL.MODELO);
        objTvTCL.desligar();
    }
    
}
