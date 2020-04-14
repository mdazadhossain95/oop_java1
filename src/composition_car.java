public class composition_car extends composition_vhicle {

    private int doors;
    private int enginecapacity;

    public composition_car(String name, int doors, int enginecapacity) {
        super(name);
        this.doors = doors;
        this.enginecapacity = enginecapacity;
    }
}
