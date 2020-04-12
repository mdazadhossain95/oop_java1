public class vipperson {


    private String name;
    private double creditelimit;
    private String email;


    public vipperson(){
        this("defult name", 50000.00, "defukt@gmail.com");
    }



    public vipperson(String name, double creditelimit) {
        this(name, creditelimit, "unknown@gmail.com");


//        this.name = name;
//        this.creditelimit = creditelimit;
    }

    public vipperson(String name, double creditelimit, String email) {
        this.name = name;
        this.creditelimit = creditelimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditelimit() {
        return creditelimit;
    }

    public String getEmail() {
        return email;
    }
}
