import java.util.Scanner;

public class minimum_and_maximum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("enter number: ");
            boolean isanint = scanner.hasNextInt();

            if (isanint) {
                int number = scanner.nextInt();
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine();
            System.out.println("min = " + min + " , max = " + max);

        }
            scanner.close();

        }

    }
