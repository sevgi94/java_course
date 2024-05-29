public class BooleanMetodu {
    public static void main(String[] args) {
        boolean varyok=false;
        int[]notlar={45,65,65,98,75,12,97};
        for (int i=0; i< notlar.length; i++){
            if (75==notlar[i]){
                varyok=true;
                break;
            }
        }
        if (varyok==true){
            System.out.println("dizide var");
        }
        else {
            System.out.println("dizide yok");

        }
    }
}
