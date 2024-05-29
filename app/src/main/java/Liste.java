import java.util.ArrayList;
import java.util.Scanner;

public class Liste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* ArrayList<String> kullanicilar = new ArrayList<String>();
        kullanicilar.add("Ahmet");
        kullanicilar.add("Mehmet");
        String isim=input.next();
        kullanicilar.add(isim);
        System.out.println(kullanicilar.get(1));*/

       /* ArrayList<String>ogrenci_adi = new ArrayList<String>();
        ogrenci_adi.add("Ahmet");
        ogrenci_adi.add("Mehmet");
        String isim=input.next();
        ogrenci_adi.add(isim);
        System.out.println(ogrenci_adi.get(1));*/

        /*ArrayList<String> ogrenciler = new ArrayList<String>();
        System.out.println("Kaydetmek istediğiniz öğrenci sayısını giriniz:");
        int sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            System.out.println((i + 1) + ". öğrenci adını giriniz:");
            String ogrenciadi = input.next();
            ogrenciler.add(ogrenciadi);
        }
        System.out.println("tüm öğrenciler başarıyla eklendi");
        System.out.println("............");
        System.out.println("eklenecek öğrencilerin listesi");
        for (int i = 0; i < sayi; i++) {
            System.out.println(ogrenciler.get(i));
        }*/
//LİSTE UZUNLUĞU BULMA//
       /* ArrayList<String>isimler=new ArrayList<>();
        isimler.add("Sevgi");
        isimler.add("Serdar");
        isimler.add("Arven ");
        isimler.add("Bengi");
        System.out.println(isimler.size());*/

//LİSTEDEN ELEMAN SİLME //
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Sevgi");
        isimler.add("Serdar");
        isimler.add("Arven Bengi");
        isimler.remove(2);
        System.out.println(isimler);
    }
}
