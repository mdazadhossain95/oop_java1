public class string {

    public static void main(String[] args){

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String mystring = "this is my string";
        System.out.println(" mystring is = " + mystring);
        mystring = mystring + ",and this is more. ";
        System.out.println(" mystring is = " + mystring);
        mystring = mystring + " \u00A9 2020";
        System.out.println(" mystring is = " + mystring);

        String numberstring = "20.20";
        numberstring = numberstring + " 10.10";
        System.out.println("my numberstring is " + numberstring);

        String mylaststring = "20 ";
        int myint = 50;
        mylaststring = mylaststring + myint;
        System.out.println(" my laststring with int is = " + mylaststring);
        double mydouble = 5.9;
        mylaststring = mylaststring + mydouble;
        System.out.println("my laststring with double is = " + mylaststring);
    }
}
