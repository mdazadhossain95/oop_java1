import java.util.Scanner;

public class reading_user_input_challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10){
            int order = counter + 1;
            System.out.println("enter number # " + order + ":");

        boolean isanint = scanner.hasNextInt();

        if(isanint){
            int number = scanner.nextInt();
            counter++;
            sum += number;
//            if(counter == 10){
//                break;
//            }

        }else {
            System.out.println("invalid number");
        }

        scanner.nextLine();

        }
        System.out.println("sum " + sum);
        scanner.close();


    }
}
