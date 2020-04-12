public class parsing_value_from_a_string {

    public static void main(String[] args) {
         String numberasstring ="2020.22";
        System.out.println("number as string = " + numberasstring);


//        int number = Integer.parseInt(numberasstring);
//        System.out.println("number = " + number);

        double number = Double.parseDouble(numberasstring);
        System.out.println("number = " + number);

        numberasstring +=1;
        number +=1;


        System.out.println("numberasdtring = " + numberasstring);
        System.out.println("number = " + number);



    }
}
