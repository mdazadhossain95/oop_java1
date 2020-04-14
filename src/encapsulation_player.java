public class encapsulation_player {

    public String fullname;
    public int health;
    public String weapon;

    public void losehealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("player lnocked out");
        }
    }


    public int healthremaning() {
        return this.health;
    }


}
