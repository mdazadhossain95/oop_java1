public class composition_badroom_bad {


    private String style;
    private int pillows;
    private int hieght;
    private int sheets;
    private int quit;

    public composition_badroom_bad(String style, int pillows, int hieght, int sheets, int quit) {
        this.style = style;
        this.pillows = pillows;
        this.hieght = hieght;
        this.sheets = sheets;
        this.quit = quit;
    }


    public void make(){
        System.out.println("bad => making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHieght() {
        return hieght;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuit() {
        return quit;
    }
}
