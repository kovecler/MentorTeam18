package team18Projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketSorusu {
    //programı ben hallediyorum.Mehmet C
    static List<String> urunNo = new ArrayList<>();
    static List<String> urunler = new ArrayList<>();
    static List<Double> fiyat = new ArrayList<>();
    public static void main(String[] args) {



        urunNo.add("00");
        urunNo.add("01");
        urunNo.add("02");
        urunNo.add("03");
        urunNo.add("04");
        urunNo.add("05");
        urunNo.add("06");
        urunNo.add("07");
        urunNo.add("08");
        urunNo.add("09");
        urunNo.add("10");


        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Soğan");
        urunler.add("Havuç");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Çilek");
        urunler.add("Kavun");
        urunler.add("Üzüm");
        urunler.add("Limon");


        fiyat.add(2.10);
        fiyat.add(3.20);
        fiyat.add(1.50);
        fiyat.add(2.30);
        fiyat.add(3.10);
        fiyat.add(1.20);
        fiyat.add(1.90);
        fiyat.add(6.10);
        fiyat.add(4.30);
        fiyat.add(2.70);
        fiyat.add(0.50);
        System.out.println("**************WELCOME TO MY GREENGROCER*************");
        System.out.println("ürünleri listelemek istiyor musunuz? E/H");

        Scanner scan = new Scanner(System.in);
        char listele = scan.next().toLowerCase().charAt(0);

        if (listele == 'e') {
            urunleriListele();

        }else if (listele== 'h'){
            System.out.println("ihtiyacınız olduğunda yine bekleriz");
        }

        System.out.println("Lütfen istediğiniz ürünün kodunu giriniz");
        int urunKodu=scan.nextInt();
        int urunMiktari;
        if (urunKodu==8){
            System.out.println("kaç adet almak istiyorsunuz?");
            urunMiktari=scan.nextInt();
        }else if (urunKodu>=0 && urunKodu<urunler.size()){
            System.out.println("kaç kg almak istiyorsunuz? ");
            urunMiktari=scan.nextInt();
        }else {
            System.out.println("lütfen seçiminizi 0'dan "+(urunler.size()-1)+" 'a kadar olan bir ürün kodu giriniz");
            urunleriListele();
        }

    }
     public static void urunleriListele (){

        for(int i=0; i<urunNo.size(); i++){

            System.out.println(urunNo.get(i)+ " kodlu "+ urunler.get(i)+" ürününün fiyatı "+ fiyat.get(i)+" TL dir.");
        }




     }

    /*/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */
}
