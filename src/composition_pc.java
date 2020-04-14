public class
composition_pc {

    private composition_case thecase;
    private composition_monitor monitor;
    private composition_motherboard motherboard;

    public composition_pc(composition_case thecase, composition_monitor monitor, composition_motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerpc(){
        thecase.presspowerbutton();//1st print
        drawlogo();//2nd print
    }
    private void drawlogo(){
        //facy graphics
        monitor.drawpxilat(1200,50,"yallow");
    }

}
