public class composition_motherboard {

    private String model;
    private String manufacture;
    private int ramslots;
    private int cardslots;
    private String bois;


    public composition_motherboard(String model, String manufacture, int ramslots, int cardslots, String bois) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramslots = ramslots;
        this.cardslots = cardslots;
        this.bois = bois;
    }


    public void loadprogram(String programname){
        System.out.println("program "+ programname + "is noe loading...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardslots() {
        return cardslots;
    }

    public String getBois() {
        return bois;
    }
}
