/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Kamyonet extends Arac{
    @Override
    public int aracTip(){
        tip=4;
        return tip;
    }
    @Override
    public String aracAd(){
        isim="Kamyonet";
       return isim;
    }
    @Override
    public int kapladigiAlan(){
        alan=3;
        return alan;
    }
}
