public class car extends vehicle {


    private int wheels;
    private int doors;
    private int gears;
    private boolean ismanul;

    private int currentgear;

    public car(String name, String size, int wheels, int doors, int gears, boolean ismanul) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.ismanul = ismanul;
        this.currentgear = 1;
    }


    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
        System.out.println("car.setcurrentgear(); changed to " + this.currentgear + " gear. "); //1st part
    }


    public void changevelocity(int speed , int direction){ //2nd part
        move(speed,direction); //2nd part
        System.out.println("car.changevelocity() ; velocity " + speed + " direction " + direction); //3rd part
    }




}
