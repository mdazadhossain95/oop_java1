public class challenge_encapsulation {

    public static void main(String[] args) {
        //create a class and demonstate proper encapsulation techniques
        //the class will be called printer
        //it will simulate a real computer printer
        //it should have fields for the toner level , number of pages printed , and
        //also whether its a duplex printer (capable of printing on both sides of the paper)
        //add methods to fill up the toner (up to a maximum of 100%), another method to
        //simulate printing a page (which should increase the number of pages printed).
        //decide on the scope , whether to use constructors, and anything else you think is needed


            challenge_encapsulation_printer printer = new challenge_encapsulation_printer(50,false);
            System.out.println("initial page count = " + printer.getPageprinted());
           int paperprinted = printer.printpages(4);
            System.out.println("pages printed was "+ paperprinted + " new total print count for printer = " + printer.getPageprinted());
            paperprinted = printer.printpages(2);
            System.out.println("pages printed was "+ paperprinted + " new total print count for printer = " + printer.getPageprinted());






    }






}
