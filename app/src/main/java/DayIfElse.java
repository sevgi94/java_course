public class DayIfElse {
    public static void main(String[] args) {
        int day = 6;
        if (day <= 5) {
            System.out.print("Haftaiçi ");
            switch (day) {
                case 1:
                    System.out.print(" ve " + " Pazartesi");
                    break;
                case 2:
                    System.out.print(" ve " + " Sali");
                    break;
                case 3:
                    System.out.print(" ve " + " Çarşamba");
                    break;
                case 4:
                    System.out.print(" ve " + " Perşembe");
                    break;
                case 5:
                    System.out.print(" ve " + " Cuma");
                    break;
            }
        }
        else if (day > 5 && day < 8) {
            System.out.print("Haftasonu ");
            switch (day) {
                case 6:
                    System.out.print(" ve " + " cumartesi");
                    break;
                case 7:
                    System.out.print(" ve " + " pazar");
                    break;
            }
        }
        else
            System.out.print("Haftanın böyle bir günü yoktur");
    }
}

