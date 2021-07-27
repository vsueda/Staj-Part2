
import java.util.ArrayList;
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sueda
 */
public class ParkIslemleri {
   Garaj g = new Garaj();
    Scanner s = new Scanner(System.in);
    ArrayList araclar = new ArrayList();
   public void alanBelirle(){
       System.out.println("Lütfen garajınızın kapasitesini giriniz (5-50 aralığında bir değer olmalı): ");
       int alan = s.nextInt();
       if(g.garajAlan(alan)==-1){
           alanBelirle();
       }
       else{
           yazdir();
       }
       
   }
   public void yazdir(){
       System.out.println("\n\nGirebileceğiniz komutar:\nGIR<TIP> : Garaja araç girişi yapmanızı sağlar."
                + "\nCIK<TIP> : Garajdan araç çıkışı yapmanızı sağlar."
                + "\nLIST : Garajınıda bulunan araçları listelemenizi sağlar."
                + "\n\nAraçların listesi:"
                + "\nTip : 1 - Bisiklet  - 1 Birim;\n" +
"\n" +
"Tip : 2 - Motorsiklet - 1 Birim;\n" +
"\n" +
"Tip : 3 - Araba - 2 Birim;;\n" +
"\n" +
"Tip : 4 - Kamyonet - 3 Birim;\n" +
"\n" +
"Tip : 5 - Otobüs - 5 Birim;\n" +
"\n" +
"Tip : 6 - Tır -  8 Birim;"
                + "\n\n Yapmak istediğiniz eylemi girin:");
        String islem = s.next();
        
        if(islem.contains("GIR")){
            
            girisİslemi(islem, araclar);
        }
        else if(islem.contains("CIK")){
           cikisİslemi(islem, araclar);
        }
        else if(islem.contains("LIST")){
            listele(araclar);
        }
        else{
            System.out.println("\n\n*********** Lütfen komutu gösterildiği şekilde giriniz. ***********\n\n");
            yazdir();
        }
   }
   public void girisİslemi(String secim,ArrayList araclar){
        Bisiklet b=new Bisiklet();
        Motorsiklet m = new Motorsiklet();
        Araba a = new Araba();
        Kamyonet k = new Kamyonet();
        Otobus o = new Otobus();
        Tir t = new  Tir();
        switch(secim){
            case "GIR<1>":
                araclar=g.aracEkle(b, araclar);
                yazdir();
                break;
            case "GIR<2>":
                araclar=g.aracEkle(m, araclar);
                yazdir();
                break;
            case "GIR<3>":
                araclar=g.aracEkle(a, araclar);
                yazdir();
                break;
            case "GIR<4>":
                araclar=g.aracEkle(k, araclar);
                yazdir();
                break;
            case "GIR<5>":
                araclar=g.aracEkle(o, araclar);
                yazdir();
                break;
            case "GIR<6>":
                araclar=g.aracEkle(t, araclar);
                yazdir();
                break;
             default:
                System.out.println("\n\n*********** Lütfen komutu gösterildiği şekilde giriniz. ***********\n\n");
                yazdir();
        }
    }
   public void cikisİslemi(String secim,ArrayList araclar){
        Bisiklet b=new Bisiklet();
        Motorsiklet m = new Motorsiklet();
        Araba a = new Araba();
        Kamyonet k = new Kamyonet();
        Otobus o = new Otobus();
        Tir t = new  Tir();
        switch(secim){
            case "CIK<1>":
               araclar= g.aracSil(b, araclar);
               yazdir();
               break;
            case "CIK<2>":
                araclar=g.aracSil(m, araclar);
                yazdir();
                break;
            case "CIK<3>":
                araclar=g.aracSil(a, araclar);
                yazdir();
                break;
            case "CIK<4>":
                araclar=g.aracSil(k, araclar);
                yazdir();
                break;
            case "CIK<5>":
                araclar=g.aracSil(o, araclar);
                yazdir();
                break;
            case "CIK<6>":
                araclar=g.aracSil(t, araclar);
                yazdir();
                break;
                 default:
                System.out.println("\n\n*********** Lütfen komutu gösterildiği şekilde giriniz. ***********\n\n");
                yazdir();
        }
    }
   public void listele(ArrayList list){
         System.out.println("\n\n Garajda bulunan araçlar: \n\n *********** "+list+" ***********\n\n");
         yazdir();
     }
    
}
