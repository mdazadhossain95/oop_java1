public class account {


    private String number;
    private double balance;
    private String name;
    private String email;


    public account(){
        this("2020", 205.5, " defult name", "defult address", "defult phone");

        System.out.println("empty customer called");


    }

    public account(String number, double balance, String customername, String customeremail, String customerphonenumber){
        System.out.println("account constructor eith parameters called");

        this.number = number;
        this.balance = balance;
        this.name = customername;
        this.email = customeremail;
        this.phonenumber = customerphonenumber;

    }
    //code generate constructor

    public account(String name, String email, String phonenumber) {
        this("9999", 100.55, name, email, phonenumber );
//        this.name = name;
//        this.email = email;
//        this.phonenumber = phonenumber;
    }

    public void diposit (double dipositamount){
        this.balance += dipositamount;
        System.out.println("diposit of " + dipositamount + " made. new balance is " + this.balance);
    }
    public void withdrawal(double withdrawamount){
        if(balance - withdrawamount <= 0){
            System.out.println("only " + balance + " avaliable. withdrawsal not processed");
        }else {
            this.balance -= withdrawamount;
            System.out.println("withdeawal of " + withdrawamount + " processed. remaining balance = " + balance);
        }
    }


    //create code generate getters and setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    private String phonenumber;


}
