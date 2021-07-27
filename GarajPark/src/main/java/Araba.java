/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Araba extends Arac{
    @Override
    public int aracTip(){
        tip=3;
        return tip;
    }
    @Override
    public String aracAd(){
        isim="Araba";
       return isim;
    }
    @Override
    public int kapladigiAlan(){
        alan=2;
        return alan;
    }
    
}
