import android.widget.Switch;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

//UYGULAMA AÇIKLAMA//
public class UrunEkleAraBulSilListele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> urunler = new ArrayList<>();
        ArrayList<Integer> fiyatlar = new ArrayList<>();
        ArrayList<Integer> stoklar = new ArrayList<>();
        System.out.println("Market Otomayonu Uygulamasına Hoşgeldiniz:)");
        while (1 == 1) {
            System.out.println("..........................");
            System.out.println("1.ÜRÜN EKLE");
            System.out.println("2.ÜRÜN ARA");
            System.out.println("3.ÜRÜN SİL");
            System.out.println("4.ÜRÜN LİSTELE");
            System.out.println("5.ÇIKIŞ");
            System.out.println("Lütfen Yapmak İstediğiniz İşlemin İşlem Numarasını Giriniz:");
            int secim = input.nextInt();
            if (secim == 1) {
                System.out.println("...........................");
                System.out.println("ÜRÜN EKLEME");
                int sayac = 1;

                while (1 == 1) {
                    System.out.println((sayac) + ". Ürünün Adını Giriniz.");
                    urunler.add(input.next());
                    System.out.println((sayac) + ". Ürünün Fiyatını Giriniz.");
                    fiyatlar.add(input.nextInt());
                    System.out.println((sayac) + ". Ürünün Stok Adını Giriniz.");
                    stoklar.add(input.nextInt());
                    sayac++;
                    System.out.println("Üst Menü İçin 0, Yeni Ürün Eklemek İçin 1 Giriniz.");
                    int secim2 = input.nextInt();
                    if (secim2 == 0) {
                        break;
                    } else if (secim == 2) {
                        System.out.println("...............");
                        System.out.println("ÜRÜN ARAMA");
                        while (1 == 1) {
                            System.out.println("Aramak İstediğiniz Ürün Adını Giriniz:");
                            String aranan = input.next();
                            boolean varyok = false;
                            int sira = -1;
                            for (int i = 0; i < urunler.size(); i++) {
                                if (aranan.equals(urunler.get(i))) {
                                    varyok = true;
                                    sira = i;
                                    break;
                                }
                            }
                            if (varyok == true) {
                                System.out.println("aranan ürün bulundu. ");
                                System.out.println("Ürünün adı:" + urunler.get(sira));
                                System.out.println("Ürünün fiyatı:" + fiyatlar.get(sira));
                                System.out.println("Ürünün stok adeti:" + stoklar.get(sira));
                            } else {
                                System.out.println("ürün bulunamadı");
                            }
                            System.out.println("Üst Menü İçin 0, Yeni Ürün Eklemek İçin 1 Giriniz.");
                            //int secim2 = input.nextInt();
                            if (secim2 == 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }

    }
}



