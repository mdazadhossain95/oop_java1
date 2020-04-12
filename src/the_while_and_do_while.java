public class the_while_and_do_while {

    public static void main(String[] args) {

        int count =6;
//        while(count != 6){
//            System.out.println("count value is " + count);
//            count++;
//        }

//        for loop below is not identical to the aboce while loop!

//        for(int i =1; i<7; i++){
//            System.out.println("count value is "+ count);
//            break;
//        }
//        for(count = 1; count !=6; count++){
//            System.out.println("count value is " + count);
//        }


//        for(int i=6; i!=6; i++){
//            System.out.println("count value is " + count);
//        }

        do{
            System.out.println("count value is " + count);
            count++;

            if(count >100){
                break;
            }
        }while (count !=6);





//            count = 1;
//            while (true){
//                if(count == 6){
//                    break;
//                }
//                System.out.println("count value is " + count);
//                count++;
//            }



    }
}
