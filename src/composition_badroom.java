public class composition_badroom {

    private String door;
    private compositon_badroom_lamp lamp;
    private composition_bedroom_wall wall1;
    private composition_bedroom_wall wall2;
    private composition_bedroom_wall wall3;
    private composition_bedroom_wall wall4;
    private compositon_badroom_celling celling;
    private composition_badroom_bad bad;

    public composition_badroom(String door, compositon_badroom_lamp lamp, composition_bedroom_wall wall1, composition_bedroom_wall wall2, composition_bedroom_wall wall3, composition_bedroom_wall wall4, compositon_badroom_celling celling, composition_badroom_bad bad) {
        this.door = door;
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.celling = celling;
        this.bad = bad;
    }

    public void makebad(){
        System.out.println("badroom => making bad");
        bad.make();
    }

    public String getDoor() {
        return door;
    }

    public compositon_badroom_lamp getLamp() {
        return lamp;
    }


    public composition_bedroom_wall getWall1() {
        return wall1;
    }

    public composition_bedroom_wall getWall2() {
        return wall2;
    }

    public composition_bedroom_wall getWall3() {
        return wall3;
    }

    public composition_bedroom_wall getWall4() {
        return wall4;
    }

    public compositon_badroom_celling getCelling() {
        return celling;
    }

    public composition_badroom_bad getBad() {
        return bad;
    }
}
