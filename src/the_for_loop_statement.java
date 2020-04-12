public class the_for_loop_statement {


    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateinterest(10000, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateinterest(10000, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateinterest(10000, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateinterest(10000, 5.0));



        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " hello!");

        }

//        using the for statement , call the calculateinterest method eith
//        the amount of 10000 eith interestrate of 2,3,4,5,6,7, and 8
//        and print the result to the consolr window.
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateinterest(10000, i)));

        }
        System.out.println("*********************************");
//        how to modify the for loop above to the same thing as
//        shown but to start from 8% and work back to 2%

        for (int i = 9; i > 2; i--) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateinterest(10000, i)));

        }
        int count = 0;
        for (int i = 10; i<50; i++) {
            if (isprime(i)); {
//            prime number list
//            https://www.mathsisfun.com/numbers/prime-numbers-to-10k.html
                count++;
                System.out.println("number " + i + " is a prime number");

                if (count == 10) {
                    System.out.println("waiting for loop");
                    break;
                }

            }
        }

        }

//    anouther
//    crete a for statement using any range of numbers
//    determine if the number is a prime number using the isprime  method
//    if it is a prime number, print it out and increment a count of the
//    number of prime numbers found
//    hint : use the break; statement to exit

        public static boolean isprime(int n){
            if (n == 1) {
                return false;
            }
//            can use i <=n/2 or (long)Math.sqrt(n);
            for (int i = 2; i <=n/2; i++) {
                System.out.println("looping " +i);
                if (n % i == 0) {
                    return false;
                }
            }
            return false;
        }
    public static double calculateinterest(double amount, double interestrate) {
        return (amount * (interestrate / 100));

    }




}
