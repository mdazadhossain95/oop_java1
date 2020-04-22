import java.util.ArrayList;
import java.util.Scanner;

public class list_and_arraylist {

    static class grocerylist {
        private int[] mynumbers = new int[50];
        private ArrayList<String> grocerylist = new ArrayList<String>();


        public void addgroceryitem(String item) {
            grocerylist.add(item);
        }

        public ArrayList<String> getGrocerylist() {
            return grocerylist;
        }

        public void printgrocerylist() {
            System.out.println("you have " + grocerylist.size() + " item in your grocery list");
            for (int i = 0; i < grocerylist.size(); i++) {
                System.out.println((i + 1) + " , " + grocerylist.get(i));
            }
        }


        public void modifygroceryitem(String cerruntitem, String newitem) {
            int position = finditem(cerruntitem);
            if (position >= 0) {
                modifygroceryitem(position, newitem);
            }

        }

        private void modifygroceryitem(int position, String newitem) {
            grocerylist.set(position, newitem);
            System.out.println("grocery item " + (position + 1) + " has been modified");
        }

        private void removegroceryitem(String item) {
            int position = finditem(item);
            if (position >= 0) {
                removegroceryitem(position);  //problem
            }
        }

        public void removegroceryitem(int positon) {
            // String theitem = grocerylist.get(positon);
            grocerylist.remove(positon);
        }

        private int finditem(String searchitem) {
//        boolean wxists = grocerylist.contains(searchitem);
//            int position = grocerylist.indexOf(searchitem);
//            if (position >= 0) {
            return grocerylist.indexOf(searchitem);
//            }
//            return null;
        }

        public boolean onfile(String searchitem) {
            int position = finditem(searchitem);
            if (position >= 0) {
                return true;
            }
            return false;
        }


    }

    public static Scanner scanner = new Scanner(System.in);
    private static grocerylist grocerylist = new grocerylist();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printinatructions();
        while (!quit) {
            System.out.println("enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printinatructions();
                    break;
                case 1:
                    grocerylist.printgrocerylist();
                    break;
                case 2:
                    additem();
                    break;
                case 3:
                    modifyitem();
                    break;
                case 4:
                    removeitem();
                    break;
                case 5:
                    searchitem();
                    break;
                case 6:
                    processarraylist();
//                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    public static void printinatructions() {
        System.out.println("\npress");
        System.out.println("\n 0 - to ptint choice options.");
        System.out.println("\n 1 - to print the list of grocery item. ");
        System.out.println("\n 2 - to add an item to the list. ");
        System.out.println("\n 3 - to modify an item in the list. ");
        System.out.println("\n 4 - to remove an item from the list. ");
        System.out.println("\n 5 - to search for an item in the list. ");
        System.out.println("\n 6 - to quit the application. ");

    }

    public static void additem() {
        System.out.println("please enter the grocery item : ");
        grocerylist.addgroceryitem(scanner.nextLine());
    }

    public static void modifyitem() {
        System.out.println("current item name : ");
        String itemno = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter new item : ");
        String newitem = scanner.nextLine();
        grocerylist.modifygroceryitem(itemno, newitem);
    }

    public static void removeitem() {
        System.out.println("please enter the item number : ");
        String itemno = scanner.nextLine();
        //scanner.nextLine();
        grocerylist.removegroceryitem(itemno);
    }

    public static void searchitem() {
        System.out.print("please enter the item number to search for : ");
        String searchitem = scanner.nextLine();
        scanner.nextLine();
        if (grocerylist.onfile(searchitem)) {
            System.out.println("fornd " + searchitem + " in our grocery list");
        } else {
            System.out.println(searchitem + " is not in the shopping list");
        }
    }

    public static void processarraylist() {
        ArrayList<String> newarray = new ArrayList<String>();
        newarray.addAll(grocerylist.getGrocerylist());

        ArrayList<String> nextarray = new ArrayList<String>(grocerylist.getGrocerylist());

        String[] myarray = new String[grocerylist.getGrocerylist().size()];
        myarray = grocerylist.getGrocerylist().toArray(myarray);


    }


}
