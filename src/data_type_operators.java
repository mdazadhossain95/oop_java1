public class data_type_operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int lastresult = result;

        result = lastresult - 1;
        System.out.println(lastresult + " - 1 = " + result);

        lastresult = result;
        result = lastresult * 10;
        System.out.println(lastresult + " * 10 = " + result);

        lastresult = result;
        result = lastresult / 5;
        System.out.println(lastresult + " / 5 = " + result);

        lastresult = result;
        result = lastresult % 3;
        System.out.println(lastresult + " % 3 = " + result);

        lastresult = result;
        result = lastresult + 1;
        System.out.println(lastresult + " + 1 = " + result);

        result++;
        System.out.println("the result is " + result);

        result--;
        System.out.println("the result is " + result);

        result += 3;
        System.out.println("the result is " + result);

        result *= 10;
        System.out.println("the result is " + result);

        result /= 5;
        System.out.println("the result is " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("it is not an alin!");

        int topScore = 80;
        if (topScore < 100 )
            System.out.println("topscore less then 100");

        int secondtopscore = 81;
        if (topScore > secondtopscore && topScore < 100 )
            System.out.println("lets see");

        if((topScore >90) || (secondtopscore <=90))
        System.out.println("one of these test is true");

        int newvalue = 50;
        if (newvalue == 50);
        System.out.println("this is an true");

        boolean iscar = false;
        if(iscar = true)
            System.out.println("this is not soupposed to happen");

        boolean wascar = iscar ? true : false;
        if(wascar)
            System.out.println("wascar is true");



        double firstvalue = 20d;
        double secoundvalue = 80d;
        double totalvalue = (firstvalue + secoundvalue) * 25;
        System.out.println("totalvalue = " +totalvalue);
        double remainder = totalvalue % 40;
        if(remainder <=20)
            System.out.println("total was over the limit");

    }
}