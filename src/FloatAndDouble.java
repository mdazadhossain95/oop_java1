public class FloatAndDouble {

    public static void main(String[] args){
        //width of int=32 (4byte)
        int myintvalue = 5 / 3;
        //width of int=32 (4byte)
        float myfloatvalue = (float) (5.4 / 2);
        float myfloatvalue1 = (float) (5f / 3f);
        //width of int=64 (8byte)
        double mydoublevalue = 5.9 /2;
        double mydoublevalue1 = 5d /3d;

        System.out.println("myintvalue = " + myintvalue);
        System.out.println("myfloatvalue = " + myfloatvalue);
        System.out.println("myfloatvalue1 = " +myfloatvalue1);
        System.out.println("mydoublevalue = " + mydoublevalue);
        System.out.println("mydoublevalue1 = " + mydoublevalue1);
    }
}
