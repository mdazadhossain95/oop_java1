public class sum_challenge {

    public static void main(String[] args) {

        System.out.println("sum of digits in number 125 is " + sumdigits(125));
        System.out.println("sum of digits in number 125 is " + sumdigits(-125));
        System.out.println("sum of digits in number 125 is " + sumdigits(4));
        System.out.println("sum of digits in number 125 is " + sumdigits(2101));



        //write a mathod with the name sumdigits that has one int parameter called number
        //if parameter is >= 10 then the method should proess the number and return sum of all
        //sigits, otherwise return -1 to indicate an invalid value
        //the number from 0-9 have 1 digit so we don't want to process
        //them, also we don't want to process negative numbers , so also return -1 for negative number
        //for example calling the method sumdigits(125) should return 8 since 1 + 2 5 = 9.
        // add some code to the method to test out sumdigits method to determine
        //that it is working correctly for valid and invalid valus passed
        //hint:
        //use n $ 10 to extract the least-significant digit
        //use n = n / 10 to discsrd the least-significant digit.
        //the method needs to be static like other methods so far in course
        //tip
        //create a project with the name digitsumchallenge
    }
    private static int sumdigits(int number){
        if(number <10){
            return -1;
        }
        int sum = 0;
        //125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number >0){
            //extract the lestidignificant digit
            int digit = number % 10;
            sum += digit;

            //drop the lest-significant digit
            number /= 10;       //same as number = number / 10;


        }
        return sum;
    }



}
