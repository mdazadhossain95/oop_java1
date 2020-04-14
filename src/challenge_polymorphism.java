public class challenge_polymorphism {

    static class car {

        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;

        public car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
            this.engine = true;

        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

        public String startengine() {
            return "car => start engine";
        }

        public String accelereate() {
            return "car => accelerate ";
        }

        public String brake() {
            return "car => brake";
        }
    }

    static class mitsubishi extends car {

        public mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startengine() {
            return "mitsubishi => start engine";
        }

        @Override
        public String accelereate() {
            return "mitsubishi => accelerate ";
        }

        @Override
        public String brake() {
            return "mitsubishi => brake";
        }
    }


    public static void main(String[] args) {
        //we are going to go back to car analogy.
        //create a base class called car
        //it should have a few fields that would be appropriate for a generic car class.
        //engine, cylinders, wheels, etc.
        //constructor should initialize cylinders (number of ) and name , and set wheels to 4
        //and engine to true, cylinders and names would be passed parameters
        //
        //create appropriate getters
        //
        //create some methods like startengine, accelerate, and brake
        //
        //show a massage for each in the class
        //now create 3 sub classes for your favorite vehicle.
        //override the appropriate methods to demonstrate polymorphism in use.
        //put all classes in the java file(this one)




        car car = new car(8,"base car");
        System.out.println(car.startengine());
        System.out.println(car.accelereate());
        System.out.println(car.brake());

        System.out.println("========================================");

       mitsubishi mitsubishi = new mitsubishi(6,"outlander vrw 4wo");
        System.out.println(mitsubishi.startengine());
        System.out.println(mitsubishi.accelereate());
        System.out.println(mitsubishi.brake());



    }


}
