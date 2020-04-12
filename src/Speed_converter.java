import java.util.Scanner;

public class Speed_converter {

    public static long tomilesperhour(double kilometrsperhour) {

        //Scanner sc = new Scanner(System.in);
        //double kilometrsperhour = sc.nextInt();

        if (kilometrsperhour < 0) {

            return -1;
        }
        // long milesperhour =
        return Math.round(kilometrsperhour / 1.609);
        // return milesperhour;

    }

    public static void printconversion(double kilometersperhour) {

       // Scanner sc = new Scanner(System.in);
       // kilometersperhour=sc.nextInt();

        if (kilometersperhour < 0) {
            System.out.println("invalid value");
        } else {
            long milesperhour = tomilesperhour(kilometersperhour);
            System.out.println(kilometersperhour + " km/h = " + milesperhour + " mi/h ");

        }
    }
}
