public class vehicle {



    private String name;
    private String size;

        private int currentvelocity;
        private int currentdirection;



    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentvelocity = 0;
        this.currentdirection = 0;




    }


        public void steer(int direction){
        this.currentdirection += direction;
            System.out.println("vehicle.steer(); Steering at " + currentdirection + " degrees"); //4th part

        }


        public void move(int velocity, int direction){ //2nd part
        currentvelocity = velocity;
        currentdirection = direction;
            System.out.println("vehicle.move() moving at " + currentvelocity + " in direction " + currentdirection );


        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCerrentvelocity() {
        return currentvelocity;
    }

    public void setCerrentvelocity(int cerrentvelocity) {
        this.currentvelocity = cerrentvelocity;
    }

    public int getCerrentdirection() {
        return currentdirection;
    }

    public void setCerrentdirection(int cerrentdirection) {
        this.currentdirection = cerrentdirection;
    }

    public void stop(){
        this.currentvelocity = 0;
    }
}
