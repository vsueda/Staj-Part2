
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Oyuncu {
    
    public ArrayList kartDagitimi(ArrayList oyuncu, ArrayList kartlar){
     
    
      
    Random r = new Random();
    
    for (int i = 0; i < 4; i++)
            {
                int randomkart = r.nextInt(kartlar.size());
                 String kartisim=(String)kartlar.get(randomkart);
                oyuncu.add(kartisim);
                kartlar.remove(randomkart);
                 
            }
    
    return kartlar;
    }
   
}
