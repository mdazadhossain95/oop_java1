public class main1 {

    public static void main(String[] args) {


        //create a new class vipcustomer
        //it should have 3 fields name, creadit limit, and email
        //create 3 constructors
        //1st constructors should call the constructor with 3 parameters with defult value
        //2nd constructors should pass on the 2 value it recdives and add a default value for the 3rd
        //3rd constructors should save all fields.
        // create getters only for this using code generation of  intelij as setters wont be needed
        //test and confirm it work



        vipperson person1 = new vipperson();
        System.out.println(person1.getName());

        vipperson person2 = new vipperson("bob", 2500.00);
        System.out.println(person2.getName());

        vipperson person3 = new vipperson("tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());




    }



}
