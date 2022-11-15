package team18Projeler;

import java.util.Scanner;

public class UcusSorusu_MustafaAkin {
    /*
    A şehrinden uçmak isteyen bir yolcu
        B şehrine 500km
        C şehrine  700km
        D şehrine  900 km mesafededir.

    Bilet tarifesi:
    km birim fiyati : 0.10$

    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
    Kullanici gecerli bir harf girmezse gecerli harf girinceye kadar kullanicidan yeni bir harf isteyin

 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t***** Hosgeldiniz *****\nNereye yolculuk etmek istiyorsunuz?\n" +
                "Bursa'ya gitmek icin 'B'ye; Corum'a gitmek icin 'C' ye; Diyarbakir'a gitmek icin 'D'ye  basiniz");
        char gidilecekYer;
        do {
            gidilecekYer=input.next().toUpperCase().charAt(0);

            if (gidilecekYer!='B'&&gidilecekYer!='C'&&gidilecekYer!='D'){
                System.out.println("Lutfen gecerli bir harf giriniz");
            }else{
                System.out.println("Lutfen yasinizi giriniz");
                int yas = input.nextInt();

                System.out.println("Biletinizi gidis-donus icin almak istiyor musunuz?\n" +
                        "'Evet' icin 'E'ye; 'Hayir' icin herhangi bir tusa basiniz");
                char gidisDonus = input.next().toUpperCase().charAt(0);


                double fiyatB = 500 * 0.10;
                double fiyatC = 700 * 0.10;
                double fiyatD = 900 * 0.10;
                double toplamFiyat = 0;

                if (gidilecekYer == 'B') {
                    if (yas < 12) {
                        fiyatB = fiyatB - (fiyatB * 0.5);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatB - (fiyatB * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + "$ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatB + " $ dir");
                    } else if (yas < 24) {
                        fiyatB = fiyatB - (fiyatB * 0.1);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatB - (fiyatB * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatB + " $ dir");
                    } else if (yas > 65) {
                        fiyatB = fiyatB - (fiyatB * 0.3);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatB - (fiyatB * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatB + " $ dir");
                    } else {
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatB - (fiyatB * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatB + " $ dir");
                    }
                } else if (gidilecekYer == 'C') {
                    if (yas < 12) {
                        fiyatC = fiyatC - (fiyatC * 0.5);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatC - (fiyatC * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + "$ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatC + " $ dir");
                    } else if (yas < 24) {
                        fiyatC = fiyatC - (fiyatC * 0.1);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatC - (fiyatC * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatC + " $ dir");
                    } else if (yas > 65) {
                        fiyatC = fiyatC - (fiyatC * 0.3);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatC - (fiyatC * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatC + " $ dir");
                    } else {
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatC - (fiyatC * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatC + " $ dir");
                    }
                } else if (gidilecekYer == 'D') {
                    if (yas < 12) {
                        fiyatD = fiyatD - (fiyatD * 0.5);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatD - (fiyatD * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + "$ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatD + " $ dir");
                    } else if (yas < 24) {
                        fiyatD = fiyatD - (fiyatD * 0.1);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatD - (fiyatD * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatD + " $ dir");
                    } else if (yas > 65) {
                        fiyatD = fiyatD - (fiyatD * 0.3);
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatD - (fiyatD * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatD + " $ dir");
                    } else {
                        if (gidisDonus == 'E') {
                            toplamFiyat += fiyatD - (fiyatD * 0.20);
                            System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + toplamFiyat + " $ dir");
                        } else System.out.println("Yolculugunuz icin odeyeceginiz toplam miktar: " + fiyatD + " $ dir");
                    }
                }
            }

        }while (gidilecekYer!='B'&&gidilecekYer!='C'&&gidilecekYer!='D');
    }
}
