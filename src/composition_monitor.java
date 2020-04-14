public class composition_monitor {

    private String model;
    private String manufacture;
    private int size;
    private composition_resolution nativresolution;

    public composition_monitor(String model, String manufacture, int size, composition_resolution nativresolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativresolution = nativresolution;
    }

    public void drawpxilat(int x, int y, String color){
        System.out.println("drawing pixel at " + x + " , " + y + " in color " + color); //2nd print
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public composition_resolution getNativresolution() {
        return nativresolution;
    }
}
