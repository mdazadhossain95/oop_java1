public class composition {

    public static void main(String[] args) {
        composion_dimensions dimensions = new composion_dimensions(20,20,5);
        composition_case thecase = new composition_case("2288","dell","240",dimensions);



        composition_monitor themoniter = new composition_monitor("27inch beast","acer", 27, new composition_resolution(2540,1440));

        composition_motherboard themotherboard = new composition_motherboard("bj-200","asus",4,6,"v2.44");

        composition_pc thepc = new composition_pc(thecase,themoniter,themotherboard);
       thepc.powerpc();

        System.out.println("==============================================");


       //challenge
        //create a dingle room of a house using composition
        //think about the things that should be included in the room
        //maybe physical parts of the house but furniture as well
        //add at least one method to access an object via a getter and
        //then that object public method as you saw in the previous video
        //then add at least one method to hide the object w.g.not using a getter
        //nut to access the object used in composition within the main class

        composition_bedroom_wall wall1 = new composition_bedroom_wall("wast");
        composition_bedroom_wall wall2 = new composition_bedroom_wall("east");
        composition_bedroom_wall wall3 = new composition_bedroom_wall("south");
        composition_bedroom_wall wall4 = new composition_bedroom_wall("north");

        compositon_badroom_celling celling = new compositon_badroom_celling(12,1);


        composition_badroom_bad badroom_bad = new composition_badroom_bad("modern", 4,3,2,1);

        compositon_badroom_lamp lamp = new compositon_badroom_lamp("classic",false,75);

        composition_badroom badroom = new composition_badroom("azad", lamp, wall1, wall2, wall3,wall4, celling, badroom_bad);
        badroom.makebad();

        badroom.getLamp().turnon();
    }





}

