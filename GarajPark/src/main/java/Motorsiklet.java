/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Motorsiklet extends Arac{
    @Override
    public int aracTip(){
        tip=2;
        return tip;
    }
    @Override
    public String aracAd(){
        isim="Motorsiklet";
       return isim;
    }
    @Override
    public int kapladigiAlan(){
        alan=1;
        return alan;
    }
}
