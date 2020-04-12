public class methods_in_java {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        int highscore = calculatescore(gameover, score, levelcompleted, bonus);
        System.out.println("you final score was " + highscore);

        score = 10000;
        levelcompleted = 8;
        bonus = 200;

        calculatescore(gameover, score, levelcompleted, bonus );
    }

//        if (gameover == true){
//            int finalscore = score + (levelcompleted * bonus);
//            System.out.println("your final score was " + finalscore);
//        }
//        score = 10000;
//        levelcompleted = 8;
//        bonus = 200;
//
//        if (gameover){
//            int finalscore = score + (levelcompleted * bonus);
//            finalscore +=1000;
//            System.out.println("your final score was " + finalscore);
//
//        }}
        public static int calculatescore(boolean gameover,int score, int levelcompleted, int bonus){
//            boolean gameover = true;
//            int score = 800;
//            int levelcompleted = 5;
//            int bonus = 100;

            if (gameover) {
                int finalscore = score + (levelcompleted * bonus);
                finalscore += 20000;
                System.out.println("your final score was " + finalscore);
                return finalscore;

            }
            return -1;
    }
}
