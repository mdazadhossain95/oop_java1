public class composition_case {

    private String model;
    private String manufecturer;
    private String powersupply;
    private composion_dimensions dimensions;

    public composition_case(String model, String manufecturer, String powersupply, composion_dimensions dimensions) {
        this.model = model;
        this.manufecturer = manufecturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void presspowerbutton(){
        System.out.println("power button pressed");//1st print
    }

    public String getModel() {
        return model;
    }

    public String getManufecturer() {
        return manufecturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public composion_dimensions getDimentions() {
        return dimensions;
    }

}
