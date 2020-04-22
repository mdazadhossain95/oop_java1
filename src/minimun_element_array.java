import java.util.Scanner;

public class minimun_element_array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter count : ");
        int count = scanner.nextInt();
        scanner.nextLine();


        int[] returenarray = readintgers(count);
        int returnedmin = findmin(returenarray);

        System.out.println("min = " + returnedmin);


    }

    private static int[] readintgers(int count) {

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number : ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }


    private static int findmin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;

    }


}
