public class encapsulation {


    public static void main(String[] args) {


//        encapsulation_player player = new encapsulation_player();
//        player.name = " azad ";
//        player.health = 20;
//        player.weapon = "swoed0";
//
//        int damage = 10;
//        player.losehealth(damage);
//        System.out.println("remaning health  " + player.healthremaning());
//
//
//
//        damage = 11;
//        player.health = 200;
//        player.losehealth(damage);
//        System.out.println("remaning health " + player.healthremaning());


        encapsulation_enhanceplayer player = new encapsulation_enhanceplayer("azad", 200, "sword");
        System.out.println("initial health is " + player.getHithealth());










    }


}
