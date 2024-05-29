import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[]notlar={65,78,50,95,80,8};
        Arrays.sort(notlar);
        for (int i=0; i<notlar.length;i++){
            System.out.println(notlar[i]);
        }
    }
}
