class movie {
    private String name;

    public movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class jaws extends movie {
    public jaws() {
        super("jaws");
    }

    public String plot() {
        return "a shark eats lot of people";
    }
}

class indendenceday extends movie {

    public indendenceday() {
        super("indendence");
    }


    @Override
    public String plot() {
        return "alines attempt to take over planet earth";

    }
}


class mazerunner extends movie {

    public mazerunner() {
        super("maze runner");
    }

    @Override
    public String plot() {
        return "kids try and escape a maze";

    }
}

class sterwars extends movie {
    public sterwars() {
        super("star wars");
    }

    @Override
    public String plot() {
        return "imperial forces try to take the universe";
    }
}

class forgerable extends movie {
    public forgerable() {
        super("forgetable");

    }

//no plot method
}

public class polymorphism {

    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            movie movie =rendomemovie();
            System.out.println("movie # " + i +
                    "; " + movie.getName() + "\n" +
                    "plot :" + movie.plot() + "\n");
        }

    }


    public static movie rendomemovie() {
        int rendomnember = (int) (Math.random() * 5) + 1;
        System.out.println("random number genarate was : " + rendomnember);
        switch (rendomnember) {
            case 1:
                return new jaws();

            case 2:
                return new indendenceday();

            case 3:
                return new mazerunner();

            case 4:
                return new sterwars();

            case 5:
                return new forgerable();

        }
        return null;
    }

}

