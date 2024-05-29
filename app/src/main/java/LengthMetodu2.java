import java.util.Scanner;
public class LengthMetodu2 {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print("Kişi sayısını giriniz:");
int eleman=input.nextInt();
String[] isimler=new String[eleman];
for(int i=0;i<eleman;i++){
    System.out.println((i+1)+ "Kullanıcının adını giriniz:");
    isimler[i]=input.next();
}
int eleman_sayisi=isimler.length;
        if (eleman_sayisi<=10){
            System.out.println("eleman sayısı çok az");
        }
        else if (eleman_sayisi>10 && eleman_sayisi<=20){
            System.out.println("eleman sayısı yeterli");
        }
        else {
            System.out.println("çok fazla eleman var");
        }

    }
}
