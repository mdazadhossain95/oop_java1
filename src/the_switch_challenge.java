public class the_switch_challenge {

    //create a new switch statement using char instead of int
    //create a new char variable
    //create a switch statement testing for
    //A, B, C, D, or E
    //  display a massage if any of these are found and then break
    // add a default which displays a massage saying not found


    public static void main(String[] args) {
        char switchvalue = 'D';

        switch (switchvalue){
            case 1:
                System.out.println("value is A");
                break;
            case 2:
                System.out.println("value is B");
                break;
            case 3:
                System.out.println("value is C");
                break;
            case 4:
                System.out.println("value is D");
                break;
            case 5:
                System.out.println("value is E");
                break;
            default:
                System.out.println("value not found");
                break;

//            or

//            case 1: case 2: case 3: case 4: case 5:
//                System.out.println(switchvalue + " is found");
//                break;
//            default:
//                System.out.println("not found");
//                break;


        }

//        String month = "june";
//        switch (month.toUpperCase()){
//            //if need lower case can use .tolowercase()
//            case "JANUARY":
//                System.out.println("jan");
//                break;
//            case "JUNE":
//                System.out.println("jun");
//                break;
//            default:
//                System.out.println("not sure");
//                break;
//        }
    }
}
