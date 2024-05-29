import java.util.Scanner;
public class VizeFinalNotu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("vize notunu girin:");
        double vize_notu= input.nextDouble();
        System.out.println("final notunu girin:");
        double final_notu= input.nextDouble();
        double ortalama=(vize_notu*0.4)+(final_notu*0.6);
        System.out.println("sonuc:"+ortalama);
    }
}
