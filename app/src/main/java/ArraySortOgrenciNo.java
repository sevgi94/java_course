import java.util.Arrays;
import java.util.Scanner;

public class ArraySortOgrenciNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] notlar=new int[10];
        for(int i=0; i<10; i++){
            System.out.println((i+1)+  ". Notu giriniz:");
            notlar[i]=input.nextInt();
        }
        Arrays.sort(notlar);
        System.out.println("NOTLARIN SIRALANMIŞ ŞEKLİ");
        for (int j=0; j<10; j++) {
            System.out.println(notlar[j]);
        }
    }
}
