package interfaces;

public class mobilephone implements itelephone{

        private int mynumber;
        private boolean isringing;
        private boolean ison = false;

        public mobilephone(int mynumber) {
            this.mynumber = mynumber;
        }

        @Override
        public void poweron() {
            System.out.println("no action teken, desk phone does not have a power button");

        }

        @Override
        public void dial(int phonenumber) {
            if (ison) {
                System.out.println("now ringing " + phonenumber + " on deskphone");
            } else {
                System.out.println("phone is switched off");
            }
        }
        @Override
        public void answer() {
            if(isringing){
                System.out.println("answering the mobilephone");
                isringing = false;
            }

        }

        @Override
        public boolean callphone(int phonenumber) {
            if(phonenumber == mynumber && ison){
                isringing = true;
                System.out.println("melody ring");
            }else {
                isringing = false;
                System.out.println("mobile phone not on or number different");
            }
            return isringing;
        }

        @Override
        public boolean isringing() {
            return isringing;
        }
    }
