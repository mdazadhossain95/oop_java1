public class encapsulation_enhanceplayer {

    private String name;
    private int hithealth = 100; //use refactor to rename
    private String weapon;

    public encapsulation_enhanceplayer(String name, int health, String weapon) {
        this.name = name;

        if (health >0 && health <=100){
            this.hithealth = health;

        }
        this.weapon = weapon;

    }
    public void losehealth(int damage) {
        this.hithealth = this.hithealth - damage;
        if (this.hithealth <= 0) {
            System.out.println("player knocked out");
        }
    }

    public int getHithealth() {
        return hithealth;
    }
}
