import java.util.Scanner;
public class LengthMetodu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("eleman sayısını giriniz:");
        int elemansayisi=input.nextInt();
        int[] dizi=new int[elemansayisi];
        if (elemansayisi<=10){
            System.out.println("eleman sayısı çok az");
        }
        else if (elemansayisi>10 && elemansayisi<=20){
            System.out.println("eleman sayısı yeterli");
        }
        else {
            System.out.println("çok fazla eleman var");
        }
    }
}
