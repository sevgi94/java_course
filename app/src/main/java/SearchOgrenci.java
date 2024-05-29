import java.util.Arrays;
import java.util.Scanner;

public class SearchOgrenci {
    public static void main(String[] args) {
       /* boolean varyok = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Öğrenci sayısını giriniz:");
        int ogradi = input.nextInt();
        String ad=input.next();
        String[] isimler = new String[ogradi];
        for (int i = 0; i < isimler.length; i++)
            {
                if (ad== isimler[i]) {
                    varyok = true;
                    break;
                }
            System.out.println((i + 1) + "Öğrenci adını giriniz:");
            isimler[i] = input.next();
            }
            if (varyok == true) {
                System.out.println("kullanıcı bulundu");
            } else {
                System.out.println("kullanıcı bulunamadı");
            }
    }*/
       /* Scanner input=new Scanner(System.in);
        String[]kullanicilar=new String[3];
        for (int i=0; i<3;i++){
            System.out.println("kullanıcıları giriniz:");
            kullanicilar[i]=input.next();
        }
        System.out.println("Aramak istediğin kullanıcıyı giriniz:");
        String isim=input.next();
        boolean varyok=false;
        for (int i=0; i<3;i++){
            if (kullanicilar[i].equals(isim)){
                varyok=true;
                break;
            }
        }
        if (varyok==true){
            System.out.println("kullanıcı var");
        }
        else {
            System.out.println("kullanıcı yok");
        }
    }*/


       /* Scanner input = new Scanner(System.in);
        String[] ogrenciler = new String[5];
        int[] not1 = new int[5];
        int[] not2 = new int[5];
        int[] ortalama= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Öğrenci adını giriniz:");
            ogrenciler[i]=input.next();
            System.out.println("öğrencinin 1. notunu giriniz:");
            not1[i]=input.nextInt();
            System.out.println("öğrencinin 2. notunu giriniz:");
            not2[i]=input.nextInt();
        }
        for (int x=0; x<ortalama.length; x++)
            System.out.println(ogrenciler[x]+ "isimli öğrencinin not ortalaması"+ ((not1[x]+not2[x])/2));*/




                Scanner input = new Scanner(System.in);
                String[] kullanicilar = new String[2];
                int[] yazili1 = new int[2];
                int[] yazili2 = new int[2];
                int[] ort = new int[2];
                boolean varyok=false;
                String arananogrenci;

                for (int i = 0; i < 2; i++) {
                    System.out.println((i + 1) + ". Öğrencinin Adını Giriniz:");
                    kullanicilar[i] = input.next();
                    System.out.println((i + 1) + ". Öğrencinin 1.Notunu Giriniz:");
                    yazili1[i] = input.nextInt();
                    System.out.println((i + 1) + ". Öğrencinin 2.Notunu Giriniz");
                    yazili2[i] = input.nextInt();


                } for (int m = 0; m < ort.length; m++) {
                    System.out.println(kullanicilar[m] + "isimli öğrencinin ortama notu:" + (yazili1[m] + yazili2[m]) / 2);

                    System.out.println("Aramak İstediğiniz Kullanıcıyı Giriniz:");
                    arananogrenci=input.next();

                    if((arananogrenci.equals(kullanicilar[m]))){
                        varyok=true;
                        System.out.println(kullanicilar[m]+"isimli öğrencinin notu="+(yazili1[m] + yazili2[m])/2);
                        break;}



                }
            }
        }