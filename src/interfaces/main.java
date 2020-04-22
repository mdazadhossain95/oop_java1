package interfaces;

public class main {

    public static void main(String[] args) {

        itelephone azadsphone;
        azadsphone = new deskphone(123456);
        azadsphone.poweron();
        azadsphone.callphone(123456);
        azadsphone.answer();


        azadsphone = new mobilephone(24565);
        azadsphone.poweron();
        azadsphone.callphone(24565);
        azadsphone.answer();
    }
}
