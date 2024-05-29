import java.util.Scanner;
public class CarpimTablosu {
    public static void main(String[] args) {
        System.out.println("Carpim Tablosu");
        for (int i=1; i<=10; i++){
            for (int a=1; a<=10; a++)
            {
            System.out.print( a + "x" + i + "=" + (i*a)+"\t");
        }
            System.out.println();
        }
    }
}
