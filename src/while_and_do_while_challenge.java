public class while_and_do_while_challenge {

    public static void main(String[] args) {
        //create a method called isevennumber that takes a parameter of type int
        //its purpose is to datemine if the merhod is
        //an even number or not
        //return true if an even number, othetwise return false;

//        int number = 4;
//        int finishnumber = 20;
//
//        while (number <= finishnumber){
//            number++;
//            if(!isevenumber(number)){
//                continue;
//            }
//            System.out.println("even number " + number);
//        }
            //modify the while code above
            //amke it also record the total number of even number found
            //and break once 5 are found
            //and at the end, display the total number of even numbers found
        int number = 4;
        int finishnumber = 20;
        int evennumberfound = 0;

        while (number <= finishnumber){
            number++;
            if(!isevenumber(number)){
                continue;
            }
            System.out.println("even number " + number);
                evennumberfound++;
            if(evennumberfound>=5){
                break;
            }
//            System.out.println("even number " + number);
        }
        System.out.println("total even number found = " +evennumberfound);

    }
    public static boolean isevenumber(int number) {
        if((number % 2) == 0) {
        return true;
        }else {
            return false;
    }


    }
}
