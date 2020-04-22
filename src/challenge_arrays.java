import java.util.Arrays;
import java.util.Scanner;

public class challenge_arrays {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //create a program using arrays that sorts a list of integers in descending order,
        //descending order is highest value to lowest
        //in the words if the array had the value in 106,26,81, 5 ,15 your program should
        //ultimately have an array with 106. 81. 26. 15. 5 in it.
        //set up the program so that the numbers to sort are read in from the keyboard
        //implement the following methods - getintegers, printarray, and sortintegers
        //getinteger returns an arrays of entered integers from keyboard
        //printarray prints out the contents of the array
        //and sortinteeger should sort the array and returns a new array containing the sorted numbers
        //you will have to figure out hoe to copy the array elements form the passed array into a new
        //array and sort sort them and return the new sorted array.


        int[] myinteger = getintegers(5);
        int[] sorted = sortinteger(myinteger);
        printarray(sorted);

    }

    public static int[] getintegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("enter " + capacity + " integer value.\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " contents " + array[i]);
        }
    }


    public static int[] sortinteger(int[] array) {
//        int[] sortedarray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedarray[i] = array[i];+
//        }



        int[] sortedarray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            //element   0     160
            //element   1     50
            //element   2     40


            for (int i = 0; i < sortedarray.length-1; i++) {
                if (sortedarray[i] < sortedarray[i + 1]) {
                    temp = sortedarray[i];
                    sortedarray[i]=sortedarray[i+1];
                    sortedarray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedarray;
    }


}
