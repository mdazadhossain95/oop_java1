import java.util.Scanner;

public class arrays {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myintarrays = getintegers(5);
        for (int i = 0 ; i<myintarrays.length; i++){
            System.out.println("element " + i + " typed value was " + myintarrays[i]);
        }

        System.out.println("averrege is " + getaverrage(myintarrays));
    }

//        int[] myintarrys = new int[10];  //{1,2,3,4,5,6,7,8,9,10};
//
////        myintarrys[0] = 50;
////        myintarrys[1] = 50;
////        myintarrys[2] = 50;
////        myintarrys[3] = 50;
//
////        System.out.println(myintarrys[0]);
////        System.out.println(myintarrys[2]);
////        System.out.println(myintarrys[3]);
////        System.out.println(myintarrys[4]);
//        for (int i = 0; i < 10; i++) {
//            myintarrys[i] = i * 10;
//
//        }
//        printarray(myintarrys);
//    }
//
//    //        for (int i=0; i<10; i++){
////            System.out.println("element " +i + " , value is " + myintarrys[i]);
////        }
////        System.out.println("==================================================");
////
////        for(int i = 0; i<myintarrys.length; i++){
////            myintarrys[i] = i * 10;
////
////        }
////        for (int i=0; i<myintarrys.length; i++){
////            System.out.println("element " +i + " , value is " + myintarrys[i]);
////        }
//    public static void printarray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("element " + i + " , value is " + array[i]);
//        }
//
//    }


    public static int[] getintegers(int number){
        System.out.println("enter " + number + " integer value.\r") ;
        int[] values = new int[number];

        for (int i = 0 ; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getaverrage(int[] array){
        int sum = 0;
        for (int i = 0 ; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }


}
