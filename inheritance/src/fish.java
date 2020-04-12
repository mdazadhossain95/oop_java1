public class fish extends animal{

    private int gills;
    private int eyes;
    private int fins;

    public fish(String name,  int size, int weight, int gills, int eyes, int fins) {
        super(name, 1,1 , size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }


    private void rest(){

    }
    private void movemusles(){


    }
    private void movebackfin(){


    }
    private void swim(int speed){
        movemusles();
        movebackfin();
        super.move(speed);
    }



}
