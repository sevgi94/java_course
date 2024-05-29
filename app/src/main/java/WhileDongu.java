import java.util.Scanner;
public class WhileDongu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("faktoriyeli alınacak sayıyı girin:");
        int sayi=input.nextInt();
        int faktoriyel=1;
        while (1<=sayi){
            faktoriyel=faktoriyel*sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }
}
