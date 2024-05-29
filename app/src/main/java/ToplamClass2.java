import java.util.Scanner;

public class ToplamClass2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        int toplam=0;
        for(int i=1; i<=sayi; i++){
            toplam=toplam+i;
        }
        System.out.println(toplam);

    }
}
