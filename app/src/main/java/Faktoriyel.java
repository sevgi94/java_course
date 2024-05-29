import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("faktoriyeli alınacak sayıyı girin:");
        int sayi=input.nextInt();
        int faktoriyel=1;
        for(int i=1; i<=sayi; i++){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}
