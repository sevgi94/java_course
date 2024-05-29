
import java.util.Scanner;

public class Avukat {
    public static void main(String[] args) {

               Scanner input = new Scanner(System.in);
               int[] dosya_numarasi = new int[2];
               String[] muvekkil_isimleri = new String[2];
               String[] durusma_yeri = new String[2];
               int bulunan=0;
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + ". Müvekkilin Adını Giriniz:");
            muvekkil_isimleri[i] = input.next();
            System.out.println((i + 1) + ". Müvekkilin Duruşma Yerini Giriniz:");
            durusma_yeri[i] = input.next();
            System.out.println((i + 1) + "Dosya Numarasını Giriniz");
            dosya_numarasi[i] = input.nextInt();
    }
        System.out.println(".......");
        System.out.println("Arama ekranı");
        System.out.println("Aramak İstediğiniz dosya numarasını Giriniz:");
        int aranan_numara=input.nextInt();
        boolean varyok=false;
        for (int i = 0; i < 2; i++) {
            if (aranan_numara == dosya_numarasi[i]) {
                varyok = true;
                bulunan=1;
                break;
}
}
            if(varyok==true){
         System.out.println("kayıtlı ");
            System.out.println("müvekkilin adı:" + muvekkil_isimleri[bulunan] + "dosya numarası:" + dosya_numarasi[bulunan] + "duruşma yeri:" + durusma_yeri[bulunan]);

        }
        else {
            System.out.println("kayıt yok");
        }
}
    }
