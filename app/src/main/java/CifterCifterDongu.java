import java.util.Scanner;
public class CifterCifterDongu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayiyi giriniz:");
        int i=input.nextInt();
        while (0<i) {
        System.out.println(i);
        i-=2;
    }

    }
}
