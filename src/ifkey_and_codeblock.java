public class ifkey_and_codeblock {

    public static void main(String [] args){
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

//            if (score <5000 && score >1000) {
//                System.out.println("your score was less then 1000");
//            }
//            else if (score <1000){
//                System.out.println("your score is less then 1000");
//            }
//            else {
//                System.out.println("got here");


        if (gameover == true){
            int finalscore = score + (levelcompleted * bonus);
            finalscore +=1000;
            System.out.println("your final score was " + finalscore);
    }

        boolean newgameover = true;
        int newscore = 10000;
        int newlevelcompleted = 8;
        int newbonus = 200;

        if (newgameover == true){
            int newfinalscore = newscore + (newlevelcompleted * newbonus);
            System.out.println("your final score was " + newfinalscore);
        }


}}


