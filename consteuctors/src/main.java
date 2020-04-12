public class main {


    public static void main(String[] args) {
        //create a new class for a bank account
        //create fields for the account number, balance, customer name, email and phone number,
        //
        //create getters and satters for each field
        //create the additional methods
        //1. to allow the customer to deposit funds(this should increment the balance field)
        //2. to allow the customer to withrow funds, this should deduct from the balance field,
        //but not allow the withdrowal to complete if their are insufficient funds
        /// add some System.out.println's in the two methods above as well.

        account azadsaccount = new account(); //("222", 0.00, "azad", "mdazadhossain95@gmail.com", "01626364610");
        System.out.println(azadsaccount.getNumber());
        System.out.println(azadsaccount.getBalance());


//        azadsaccount.setName("azad hossain");
//        azadsaccount.setNumber("123");
//        azadsaccount.getEmail("mdazadhossain95@gmail.com");
//        azadsaccount.setPhonenumber("01626364610");

        azadsaccount.withdrawal(100.0);

        azadsaccount.diposit(50.0);
        azadsaccount.withdrawal(100.0);


        azadsaccount.diposit(51.0);
        azadsaccount.withdrawal(100.0);

        account aaccount = new account("a", "a@gmail.com", "22200");
        System.out.println(aaccount.getNumber() + "name" + aaccount.getName());







    }
}