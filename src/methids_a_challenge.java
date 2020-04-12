public class methids_a_challenge {

    public static void main(String[] args) {

        int highscoreposition = calculatehighscorepotion(1500);
        displayhighscoreposition("Tin ", highscoreposition);

        highscoreposition = calculatehighscorepotion(900);
        displayhighscoreposition("Bob ", highscoreposition);

        highscoreposition = calculatehighscorepotion(400);
        displayhighscoreposition("Percy ", highscoreposition);

        highscoreposition = calculatehighscorepotion(50);
        displayhighscoreposition("glibert ", highscoreposition);

        highscoreposition = calculatehighscorepotion(1000);
        displayhighscoreposition("louise ", highscoreposition);

        highscoreposition = calculatehighscorepotion(500);
        displayhighscoreposition("carol ", highscoreposition);

        highscoreposition = calculatehighscorepotion(100);
        displayhighscoreposition("Frank ", highscoreposition);




    }
    public static void displayhighscoreposition(String playername, int highscorepotion){
        System.out.println(playername + "managed to get position "
                        + highscorepotion + " no the score table");

    }
    public static int calculatehighscorepotion(int playscore){

//        if(playscore >= 1000){
//            return 1;
//        }
//        else if (playscore >= 500 && playscore < 1000) {
//            return 2;
//        }
//        else if (playscore >= 100 && playscore < 500) {
//            return 3;
//        }
//        //else {
//            return 4;
//       // }

        int position = 4;

        if (playscore >= 1000){
            position = 1;
        } else if (playscore >= 500) {
            position = 2;
        } else if (playscore >= 100) {
            position = 3;
        }
        return position;
    }
}
