/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Otobus extends Arac{
    @Override
    public int aracTip(){
        tip=5;
        return tip;
    }
    @Override
    public String aracAd(){
        isim="Otobüs";
       return isim;
    }
    @Override
    public int kapladigiAlan(){
        alan=5;
        return alan;
    }
}
