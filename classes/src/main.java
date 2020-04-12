public class main {

    //concept of encapsiulaton

        public static void main(String[] args) {

            car porshe = new car();
            car holden = new car();
           // porshe = null;
           // System.out.println("model is " + porshe.getModel());
            porshe.setModel("carrera");
            System.out.println("model is " + porshe.getModel());

        }
    }
