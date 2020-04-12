public class byteshortint {

        public static void main(String[] args) {

            //int has a width of 32
            int myminvalue= -2_147_483_648;
            int mymaxvalue= 2_147_483_647;
            int mytotalvalue = (myminvalue/2);
            System.out.println(mytotalvalue);

            //byte has a width of 8
            byte mybytevalue = -128;
            byte mybytetolalvalue = (byte) (mybytevalue/2);
            System.out.println(mybytetolalvalue);
            //short has a width of 16
            short myshortvalue = 32767;
            short myshorttotalvalue = (short) (myshortvalue/2);
            System.out.println(myshorttotalvalue);

            //long has a width of 64
            long mylongvalue = 100L;
            long mylongtotalvalue = (mylongvalue/2);
            System.out.println(mylongtotalvalue);

        }
    }
