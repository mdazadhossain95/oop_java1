package interfaces;

public interface itelephone {

        void poweron();
        //    void dial();
        void dial(int phonenumber);
        void answer();
        boolean callphone(int phonenumber);
        boolean isringing();

    }
