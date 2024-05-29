import java.util.Scanner;
public class ToplamClass {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz:");
            int a=input.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
            int b=input.nextInt();
            int sonuc=a+b;
            System.out.println("sonucu yaz:" + sonuc);
                }
}
