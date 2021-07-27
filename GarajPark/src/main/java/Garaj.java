
import java.util.ArrayList;
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
public class Garaj {
    int garajDoluluk,garajAlan,kalanAlan;
    public int garajAlan(int garajAlan){
        
        if(garajAlan>50||garajAlan<5){
            return -1;
        }
        else{
            this.garajAlan=garajAlan;
        return garajAlan;
        }
        
    }
    public int garajGiris(Arac arac){
        garajDoluluk = garajDoluluk+arac.kapladigiAlan();
        
        return garajDoluluk;
    }
    public int garajCikis(Arac arac){
        int temp;
        temp = garajDoluluk-arac.kapladigiAlan();
        if(temp>=0){
            garajDoluluk = garajDoluluk-arac.kapladigiAlan();
           
            return garajDoluluk;
        }
        else{
            System.out.println("\n\n*********** Geçerli çıkış işlemi yapılamamıştır. ***********" + "\n*********** Kalan alan:" +kalanAlan()+" ***********\n" );
           
            return -1;
        }
        
    }
    public int kalanAlan(){
        
        return garajAlan-garajDoluluk;
    }
      public ArrayList aracEkle(Arac arac, ArrayList garaj){
         
       if((garajDoluluk+arac.kapladigiAlan())<=garajAlan){
           
       
        garajDoluluk=garajGiris(arac);
       
         
        
            garaj.add(arac.aracAd());
            System.out.println("\n\n*********** Araç başarıyla parkedilmiştir. ***********" + "\n*********** Kalan alan:" +kalanAlan()+" ***********\n" );
            
            return garaj;
        }
        else{
            System.out.println("\n\n*********** Garajda geçerli araç için park edilebilir alan kalmamıştır. ***********" + "\n*********** Kalan alan:" +kalanAlan()+" ***********\n" );
          
            return garaj;
        }
        
    }
    public ArrayList aracSil(Arac arac, ArrayList garaj){
        Iterator itr = garaj.iterator();
        boolean b = false;
      
        if((garajDoluluk-arac.kapladigiAlan())>-1){
         while(itr.hasNext()){
            String tempisim=(String.valueOf(itr.next()));
             if(tempisim.contains(arac.aracAd())){
                 
                 
                garajCikis(arac);
                    garaj.remove(tempisim);
                    System.out.println("\n\n*********** Geçerli aracın çıkışı yapılmıştır. ***********"
                            + "\n*********** Kalan alan:" +kalanAlan()+" ***********\n" );
                    b=true;
                    return garaj;
                }
                
               
             }
         if(b==false){
            
        
        System.out.println("\n\n*********** Silmek istediğinin araç bulunmamaktadır. ***********\n");
        return garaj;
        }
            
         }
        else{
             System.out.println("\n\n*********** Silmek istediğinin araç bulunmamaktadır. ***********\n");
        return garaj;
        }
      
           return garaj;
        
        }
        
                
}
