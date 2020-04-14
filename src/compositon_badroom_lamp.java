public class compositon_badroom_lamp {

    private String style;
    private Boolean battrey;
    private int globrating;

    public compositon_badroom_lamp(String style, Boolean battrey, int globrating) {
        this.style = style;
        this.battrey = battrey;
        this.globrating = globrating;
    }


    public void turnon(){
        System.out.println("lamp => turning on");
    }




    public String getStyle() {
        return style;
    }

    public Boolean getBattrey() {
        return battrey;
    }

    public int getGlobrating() {
        return globrating;
    }
}
