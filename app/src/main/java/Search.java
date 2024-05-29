import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[]notlar={40,55,70,89,20,100,56,23,47,76};
        int aranan= Arrays.binarySearch(notlar,76);
        if(aranan<0){
            System.out.println("Değer dizi içerisinde mevcut değil.");
        }
        else {
            System.out.println("Aranan değer dizinin  " +aranan+ ". indisinde yer almaktadır.");
        }
    }
}
