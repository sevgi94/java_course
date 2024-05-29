import java.util.Scanner;
public class BasamakDongusu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*System.out.println("sayiyi giriniz:");
        int i=input.nextInt();
        int basamak=1;
        while (i>=10) {
            i=i/10;
            basamak+=1;
            System.out.println("sayınız"+basamak+"basamaklıdır");
            }*/
        int n, basamak;
        System.out.println("bir sayı giriniz:");
        n=input.nextInt();
        basamak=1;
        while(n>=10){
            n=n/10;
            basamak++;
        }
        System.out.println("sayınız"  +  basamak  +  "basamaklıdır.");

    }
    }
