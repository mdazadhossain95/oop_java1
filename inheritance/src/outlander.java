public class outlander extends  car {

    private int roadservicemonths;

    public outlander(int i) {
        super("outlander", "4wd", 5, 5, 6, false);
        this.roadservicemonths = roadservicemonths;
    }


    public void accelerate(int rate) {

        int newvelocity = getCerrentvelocity() + rate;
        if (newvelocity == 0) {
            stop();
            setCurrentgear(1);
        } else if (newvelocity > 0 && newvelocity <= 10) {
            setCurrentgear(1);
        } else if (newvelocity > 10 && newvelocity <= 20) {
            setCurrentgear(2);
        } else if (newvelocity > 20 && newvelocity <= 30) {
            setCurrentgear(3);
        } else {
            setCurrentgear(4);


        }

        if (newvelocity > 0) {
            changevelocity(newvelocity, getCerrentdirection()); //2nd part
        }
    }

}
