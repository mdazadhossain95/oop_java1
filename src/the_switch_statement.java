public class the_switch_statement {


    public static void main(String[] args) {

//        int value =1;
//        if(value == 1){
//            System.out.println("value is 1");
//        } else if (value == 20) {
//            System.out.println("value is 2");
//        }else{
//            System.out.println("was not 1 or 2");
//        }

        int  switchvalue = 3;

        switch (switchvalue){
            case 1:
                System.out.println("va;ue is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was not a 3, or 4, or 5");
                System.out.println("actually it was a " + switchvalue);
//                break;
            default:
                System.out.println("value is not 1 or 2");
                break;
        }
    }
}
