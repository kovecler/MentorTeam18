package team18Projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciNotSitesi {
   /* ----------Öğrenci Not Sistemi-----------

            ----------Course Class Özellikleri :

    fields (variable) : name,code,prefix,note,Teacher
    Methods : Course() , addTeacher() , printTeacher()

----------Teacher Class Özellikleri :
    fields : name,mpno,branch
    Methods : Teacher()

----------Student Class Özellikleri :
    fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

-----------TASK
    Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
    her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
    yüzdesi ile dahil edin.

    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
    sınav notunun etkisi %80'dir.

    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin
    genel ortalamaya etkisi şu şekilde hesaplanır :

    Fizik Ortalaması : (90 * 0.20) + (60* 0.80);*/



    static List<String> ogrenciList= new ArrayList<>();
    static List<String> bransList= new ArrayList<>();
    static List<String> sinavSonucList= new ArrayList<>();
    static int bransNo;
    static int ogrenciNo;
    static double yazilinotu;
    static double yazilinotuYuzdesi;
    static double sozluNotu;

    static double passNote;
    static String basariDurumu;
    static int devam;


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ogrenciList.add("Ali Can");
        ogrenciList.add("Veli Can");
        ogrenciList.add("Tom Hanks");
        ogrenciList.add("Stewe Jobs");
        ogrenciList.add("Cüneyt Arkın");
        ogrenciList.add("Fatma Girik");
        ogrenciList.add("Hıncal Uluç");

        bransList.add("Matematik");
        bransList.add("Fen Bilgisi");
        bransList.add("Türkçe");
        bransList.add("İngilizce");

        System.out.println("not giriş sistemine hoş geldiniz");
        bransListYazdir();
        System.out.println("Öğrenci notu gireceğiniz branşın numarasını seçiniz");

        bransNo= input.nextInt();
        if(bransNo<0 || bransNo>=bransList.size()){
            System.out.println("lütfen listede olan bir sayı giriniz");

            bransNo= input.nextInt();
        }
        System.out.println("Aşağıdaki listeden not gireceğiniz öğrencinin nosunu seçiniz");
        ogrenciListYazdir();
        while (bransNo>=0 && bransNo<bransList.size()){


            ogrenciNo=input.nextInt();

            while (ogrenciNo>=0 && ogrenciNo<ogrenciList.size()){
            System.out.println(ogrenciList.get(ogrenciNo)+" adlı öğrencinin "+bransList.get(bransNo)+" yazılı notunu giriniz");
            yazilinotu=input.nextDouble();
            System.out.println(ogrenciList.get(ogrenciNo)+" adlı öğrencinin "+bransList.get(bransNo)+" sözlü notunu giriniz");
            sozluNotu=input.nextDouble();
            System.out.println("yazılı notu geçme notuna % kaç etki etmesini istiyorsunuz?");
            yazilinotuYuzdesi=input.nextDouble();
            System.out.println("UYARI: Sözlü notunun geçme notuna etkisi % "+(100-yazilinotuYuzdesi)+" olarak hesaplanacaktır");
            passNote= yazilinotu*yazilinotuYuzdesi/100+sozluNotu*(100-yazilinotuYuzdesi)/100;

            if (passNote>=60 ){
                basariDurumu = "BAŞARILI OLMUŞTUR";

            }else basariDurumu="BAŞARISIZ OLMUŞTUR";
            sinavSonucList.add(ogrenciNo+" nolu öğrenci "+ogrenciList.get(ogrenciNo)+" "+bransList.get(bransNo)+" branşından 1'inci yazılı notu "+yazilinotu+ " sözlü notu "+ sozluNotu+" olup geçme notu " +passNote+" olarak hesaplanmış olup öğrencimiz "+basariDurumu);
            sinavSonucListYazdir();
            System.out.println("devam etmek istiyorsanız listeden ekleme yapacağınız öğrenci nosunu giriniz devam etmek istemiyorsanız lütfen "+ogrenciList.size()+" sayısını giriniz");
            ogrenciListYazdir();

           devam= input.nextInt();
           ogrenciNo=devam;

            }

            if(devam>(ogrenciList.size()-1)){

                bransNo=bransList.size();
            }

        }



   }

    public static void ogrenciListYazdir() { for(int i=0; i<ogrenciList.size(); i++){
        System.out.println(i+" nolu öğrenci "+ ogrenciList.get(i));

    }
    }
    public static void bransListYazdir() { for(int i = 0; i<bransList.size(); i++){
        System.out.println(i+" nolu branş "+ bransList.get(i));

    }



}
    public static void sinavSonucListYazdir() { for(int i=0; i<sinavSonucList.size(); i++){
        System.out.println(sinavSonucList.get(i));

    }
    }
}

