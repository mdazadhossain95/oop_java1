import java.util.Scanner;
// we can use here #int datatype also.
public class seconds_and_minutes {

    private static final String INVALIF_VALUE_MESSAGE = "invalid value";
    public static void main(String[] args) {

        //INVALIF_VALUE_MESSAGE = "Hello ";
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter minutes");
            long minutes = sc.nextInt();
            System.out.println("enter seconds");
            long seconds = sc.nextInt();
            System.out.println(getdurationstring(minutes, seconds));
        }
        System.out.println("enter seconds");
        long seconds = sc.nextInt();

        System.out.println(getDurationstring(seconds));

    }
    private static String getdurationstring(long minutes, long seconds){

        if((minutes < 0) || (seconds< 0) || (seconds>59 )){
           // System.out.println("invalid value");
            return INVALIF_VALUE_MESSAGE;
        }
        long hours =  (minutes / 60);
        long remainingminutes = minutes % 60;

         String hoursstring = hours + "h";
         if(hours <10){
             hoursstring = "0" + hoursstring;
         }
        String minutestring = remainingminutes + "m";
        if(remainingminutes <10){
            minutestring = "0" + minutestring;
        }
        String secondsstring = seconds + "s";
        if(seconds <10){
            secondsstring = "0" + secondsstring;
        }

         return hoursstring + " " +minutestring + " " + secondsstring + " ";

    }
    private static String getDurationstring(long seconds){
        if(seconds < 0){
            return INVALIF_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingseconds = seconds % 60;

        return  getdurationstring(minutes,remainingseconds);

    }
}
