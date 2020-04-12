public class day_of_the_week {

    public static void main(String[] args) {
        printdayoftheweek(36);

    }

    private static void printdayoftheweek(int day) {

        if (day == 0) {
            System.out.println("sunday");
        } else if (day == 1) {
            System.out.println("monday");
        } else if (day == 2) {
            System.out.println("tuesday");
        } else if (day == 3) {
            System.out.println("wednesday");
        } else if (day == 4) {
            System.out.println("thursday");
        } else if (day == 5) {
            System.out.println("friday");
        } else if (day == 6) {
            System.out.println("saturday");

        } else {
            System.out.println("invalid day");
        }
//
//        switch (day){
//            case 0:
//                System.out.println("sunday");
//                break;
//                case 1:
//                    System.out.println("monday");
//                    break;
//                    case 2:
//                        System.out.println("tuesday");
//                        break;
//                        case 3:
//                            System.out.println("wednesday");
//                            break;
//                            case 4:
//                                System.out.println("thursday");
//                                break;
//                                case 5:
//                                    System.out.println("friday");
//                                    break;
//                                    case 6:
//                                        System.out.println("saturday");
//                                        break;
//            default:
//                System.out.println("not found");
//
//                System.out.println();
//        }
    }

    }
