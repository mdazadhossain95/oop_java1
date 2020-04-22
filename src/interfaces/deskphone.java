package interfaces;

public class deskphone implements itelephone {

    private int mynumber;
    private boolean isringing;

    public deskphone(int mynumber) {
        this.mynumber = mynumber;
    }

    @Override
    public void poweron() {
        System.out.println("no action teken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phonenumber) {
        System.out.println("now ringing " + phonenumber + " on deskphone");
    }
    @Override
    public void answer() {
        if(isringing){
            System.out.println("answering the desk phone");
            isringing = false;
        }

    }

    @Override
    public boolean callphone(int phonenumber) {
        if(phonenumber == mynumber){
            isringing = true;
            System.out.println("ring ring");
        }else {
            isringing = false;
        }
        return isringing;
    }

    @Override
    public boolean isringing() {
        return isringing;
    }
}
