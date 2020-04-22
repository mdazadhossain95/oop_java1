
import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);



    int[] array = {1,2,3,4,5};

        System.out.println("array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int maxindex = array.length - 1;
        int halflength = array.length / 2;
        for (int i = 0; i < halflength; i++) {
            int temp = array[i];
            array[i] = array[maxindex - i];
            array[maxindex - i] = temp;

        }
    }

    }
//    public static int[] getarrays(int capacity) {
//        int[] array = new int[capacity];
//        System.out.println("enter " + capacity + " integer value.\r");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    public static void parray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int temp = array[i];
//            while (temp != array[i]) {
//                int r = temp % 10;
//                array[i] = array[i] * 10 + r;
//                temp = temp / 10;
//            }
//            System.out.println("reverse = " +array[i]);
//        }
//
//    }


//}
