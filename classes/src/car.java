public class car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validmodel = model.toLowerCase();
        if(validmodel.equals("carrera") || validmodel.equals("commodore")){
            this.model = model;

        }else {
            this.model = "unknown";
        }



    }

    public String getModel(){
        return this.model;
    }





}
