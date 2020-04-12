public class int_byte_short_long {

    public static void main(String[] args){

        byte bytevalue = 10;
        short shortvalue = 20;
        int intvalue = 50;

        long longtotal = 50000L + 10L * (bytevalue + shortvalue + intvalue);
        short shorttotal = (short) (1000 + 10 * (bytevalue + shortvalue + intvalue));
        System.out.println("longtotal = " + longtotal);
        System.out.println("shorttotal = " +shorttotal);
    }
}
