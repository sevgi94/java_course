import java.util.Scanner;
public class ArrayOgrenciNumarasi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] ogrno=new int[5];
        String[] OgrenciAdi=new String[5];
        for (int i=0;i<5;i++){
            System.out.println((i+1) + ". öğrencinin numarasını giriniz:");
            ogrno[i]=input.nextInt();
            System.out.println((i+1)+ ". öğrencinin adını giriniz:");
            OgrenciAdi[i]=input.next();
        }
    }
}
