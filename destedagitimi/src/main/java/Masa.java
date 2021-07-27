
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class Masa {
     public void oyuncuKartAlimi(ArrayList p1, ArrayList p2,ArrayList p3,ArrayList p4){
        ArrayList kartlar = new ArrayList();
        Deste d = new Deste();  
        Oyuncu o = new Oyuncu();
        
        kartlar = d.desteOlustur();
        
        o.kartDagitimi(p1,kartlar);
        o.kartDagitimi(p2,kartlar);
        o.kartDagitimi(p3,kartlar);
        o.kartDagitimi(p4,kartlar);
       
    }
     public ArrayList siralaTip(ArrayList grup, String tip){
         Iterator itr = grup.iterator();
         ArrayList temp = new ArrayList();
         while(itr.hasNext()){
            String tempisim=(String.valueOf(itr.next()));
             if(tempisim.contains(tip)){
                 
                temp.add(tempisim);
                
               
             }
            
         }
        
         
        Collections.sort(temp);
          
          return temp;
         
     }
     public ArrayList siralama(ArrayList kartlar){
         ArrayList temp = new ArrayList();
         temp = siralaTip(kartlar, "Sinek");
         
         temp.addAll(siralaTip(kartlar, "Karo"));
         
         temp.addAll(siralaTip(kartlar, "Maça"));
     
         temp.addAll(siralaTip(kartlar, "Kupa"));
       
         return temp;
     }
      public static void main(String[] args) 
	{
		
	ArrayList oyuncu1 = new ArrayList();
        ArrayList oyuncu2 = new ArrayList();
        ArrayList oyuncu3 = new ArrayList();
        ArrayList oyuncu4 = new ArrayList();
        
        Masa m = new Masa();
        m.oyuncuKartAlimi(oyuncu1, oyuncu2, oyuncu3, oyuncu4);
        oyuncu1=m.siralama(oyuncu1);
        oyuncu2=m.siralama(oyuncu2);
        oyuncu3=m.siralama(oyuncu3);
        oyuncu4=m.siralama(oyuncu4);
            System.out.println(oyuncu1);
            System.out.println(oyuncu2);
            System.out.println(oyuncu3);
            System.out.println(oyuncu4);

	}
}
