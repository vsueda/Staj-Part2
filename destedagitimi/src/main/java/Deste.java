
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Deste {
    ArrayList kartlar = new ArrayList();
    public ArrayList desteOlustur(){
    
    Kart k = new Kart();
  for (int i = 0; i < k.kartTip().length; i++)
            {
                for (int j = 0; j < k.kartSiralama().length; j++)
                {
                    String kartIsim = k.kartTip()[i] + " " + k.kartSiralama()[j];
                    kartlar.add(kartIsim);
                    
                }
            }
    
    return kartlar;
}
}
