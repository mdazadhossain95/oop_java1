public class overloading_method {
    public static void main(String[] args) {
        int newscore = calculatescore("azad", 500);
        System.out.println("new score is " + newscore);
        calculatescore(75);
        calculatescore();
    }

    public static int calculatescore(String playername, int score) {
        System.out.println("player " +playername + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculatescore(int score) {
        System.out.println("unnamed player scored  " + score + " points");
        return score * 1000;
    }
    public static int calculatescore() {
        System.out.println("no player name, no player score.");
        return 0;
    }
}
