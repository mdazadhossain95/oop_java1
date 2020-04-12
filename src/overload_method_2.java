public class overload_method_2 {
    public static void main(String[] args) {
        double centimeters = calcfeetandinchestocentumeters(5, 4.5);
        if (centimeters < 0.0) {
            System.out.println("invalid parameters");
        }
            calcfeetandinchestocentumeters(-156);

    }

    public static double calcfeetandinchestocentumeters(double feet, double inches) {

//        (parameter1 <=0){
//            System.out.println("first parameter is " + parameter1);
//        }
//        (parameter2 >=0 && parameter2<=12){
//            return -1;
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches = " + centimeters + " cm");
        return centimeters;

    }

    public static double calcfeetandinchestocentumeters(double inches) {
        if (inches < 0) {
            System.out.println("invalid parameters");
            return -1;
        }

        double feet = (int) inches / 12;
        double remaininginches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remaininginches + "inches" );
        return calcfeetandinchestocentumeters(feet, remaininginches);


    }
}
