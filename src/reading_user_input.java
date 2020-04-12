import java.util.Scanner;

public class reading_user_input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your year of birth");

        boolean hasnextint = scanner.hasNextInt();

        if(hasnextint) {
            int yearofbirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("enter your name: ");
            String name = scanner.nextLine();

            int age = 2020 - yearofbirth;

            if (age >= 0 && age <= 100) {

                System.out.println("your name is " + name + " and your are " + age + " years old");
            } else {
                System.out.println("onvlid year of birth");
            }
        }else  {
            System.out.println("unable to prese year of birth");
            }
        scanner.close();
    }

}
