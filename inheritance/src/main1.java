public class main1  {

    public static void main(String[] args) {

        //challenge
        //start with a base class of a vehicle , then create a car class that inherits from this base class
        //finally , create another class , a specific of car that from the car class
        //you should be able to hand steering , changing gears , and moving (speed in other words)
        //you will want to decide where to put the appropriate state and behaviours (field and methods)
        //as mentioned above, chagning gears, increasing/decreasing speed should be included.
        //for you specific type of vehicle  you will want to add something specific for that type of car

        outlander outlander = new outlander(36);

        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-45);
        outlander.steer(45);



    }
}
