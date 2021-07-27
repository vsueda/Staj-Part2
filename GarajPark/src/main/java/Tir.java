/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Tir extends Arac{
    @Override
    public int aracTip(){
        tip=6;
        return tip;
    }
    @Override
    public String aracAd(){
        isim="Tır";
       return isim;
    }
    @Override
    public int kapladigiAlan(){
        alan=8;
        return alan;
    }
}
