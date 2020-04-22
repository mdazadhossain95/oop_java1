//////import java.util.Scanner;
//////
//////class JavaStaticintBlock {
//////
//////    static int B,H;
//////    static boolean flag = true;
//////    static {
//////        Scanner sc = new Scanner(System.in);
//////        B = sc.nextInt();
//////        H = sc.nextInt();
//////        if(B<=0 || H<=0){
//////            System.out.println("java.lang.Exception: Breadth and height must be positive");
//////            flag = false;
//////        }
//////    }
//////
//////
//////    public static void main(String[] args){
//////        if(flag){
//////            int area=B*H;
//////            System.out.print(area);
//////        }
//////
//////    }//end of main
//////
//////}//end of class
//////
////
////import java.util.*;
////import java.security.*;
////class JavaStaticintBlock {
////    public static void main(String[] args) {
////
////        DoNotTerminate.forbidExit();
////
////        try {
////            Scanner in = new Scanner(System.in);
////            int n = in .nextInt();
////            in.close();
////            //String s=???; Complete this line below
////
////            String s = Integer.toString(n);
////
////
////            if (n == Integer.parseInt(s)) {
////                System.out.println("Good job");
////            } else {
////                System.out.println("Wrong answer.");
////            }
////        } catch (DoNotTerminate.ExitTrappedException e) {
////            System.out.println("Unsuccessful Termination!!");
////        }
////    }
////}
////
//////The following class will prevent you from terminating the code using exit(0)!
////class DoNotTerminate {
////
////    public static class ExitTrappedException extends SecurityException {
////
////        private static final long serialVersionUID = 1;
////    }
////
////    public static void forbidExit() {
////        final SecurityManager securityManager = new SecurityManager() {
////            @Override
////            public void checkPermission(Permission permission) {
////                if (permission.getName().contains("exitVM")) {
////                    throw new ExitTrappedException();
////                }
////            }
////        };
////        System.setSecurityManager(securityManager);
////    }
////}
////
//
//

//class Animal{
//    void walk(){
//        System.out.println("I am walking");
//    }
//}
//
//class Bird extends Animal {
//    void fly() {
//        System.out.println("I am flying");
//    }
//
//    void sing() {
//        System.out.println("I am singing");
//
//    }
//
//    public static class Solution {
//
//        public static void main(String args[]) {
//
//            Bird bird = new Bird();
//            bird.walk();
//            bird.fly();
//            bird.sing();
//
//        }
//    }
//}

//class Aritmatic{
//    public String getName(){
//        return "Aritmatic";
//    }
//}
//class Adder extends Aritmatic{
//    public int add(int a, int b){
//        return a+b;
//    }
//}
//
//class Solution{
//    public static void main(String []args){
//        // Create a new Adder object
//        Adder a = new Adder();
//
//        // Print the name of the superclass on a new line
//        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
//
//        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
//        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
//    }
//}


//import java.util.*;
//abstract class Book{
//    String title;
//    abstract void setTitle(String s);
//    String getTitle(){
//        return title;
//    }
//}
//class MyBook extends Book{
//
//    @Override
//    void setTitle(String s) {
//        title = s;
//    }
//}
//
//class Main{
//
//    public static void main(String []args){
//        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
//        Scanner sc=new Scanner(System.in);
//        String title=sc.nextLine();
//        MyBook new_novel=new MyBook();
//        new_novel.setTitle(title);
//        System.out.println("The title is: "+new_novel.getTitle());
//        sc.close();
//
//    }
//}

//import java.util.*;
//interface AdvancedArithmetic{
//    int divisor_sum(int n);
//}
//
//class MyCalculator implements AdvancedArithmetic{
//
//    @Override
//    public int divisor_sum(int n) {
//        int sum = 0;
//        for(int i = 1; i<=n; i++){
//            if(n%i == 0){
//                sum+=1;
//            }
//        }
//        return sum ;
//    }
//}
//
//class Solution{
//    public static void main(String []args){
//        MyCalculator my_calculator = new MyCalculator();
//        System.out.print("I implemented: ");
//        ImplementedInterfaceNames(my_calculator);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(my_calculator.divisor_sum(n) + "\n");
//        sc.close();
//    }
//    /*
//     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
//     */
//    static void ImplementedInterfaceNames(Object o){
//        Class[] theInterfaces = o.getClass().getInterfaces();
//        for (int i = 0; i < theInterfaces.length; i++){
//            String interfaceName = theInterfaces[i].getName();
//            System.out.println(interfaceName);
//        }
//    }
//}


//class Sports{
//
//    String getName(){
//        return "Generic Sports";
//    }
//
//    void getNumberOfTeamMembers(){
//        System.out.println( "Each team has n players in " + getName() );
//    }
//}
//
//class Soccer extends Sports{
//    @Override
//    String getName() {
//        return super.getName();
//    }
//
//    @Override
//    void getNumberOfTeamMembers() {
//        super.getNumberOfTeamMembers();
//            System.out.println("Each team has 11 players in " + getName());
//    }
//
//}
//
//public class JavaStaticInitBlock {
//
//    public static void main(String []args){
//        Sports c1 = new Sports();
//        Soccer c2 = new Soccer();
//        System.out.println(c1.getName());
//        c1.getNumberOfTeamMembers();
//        System.out.println(c2.getName());
//        c2.getNumberOfTeamMembers();
//    }
//}

//class BiCycle{
//    String define_me(){
//        return "a vehicle with pedals.";
//    }
//}
//
//class MotorCycle extends BiCycle{
//    String define_me(){
//        return "a cycle with an engine.";
//    }
//
//    MotorCycle(){
//        System.out.println("Hello I am a motorcycle, I am "+ define_me());
//
//        String temp=super.define_me(); //Fix this line
//
//        System.out.println("My ancestor is a cycle who is "+ temp );
//    }
//
//}
//class Solution{
//    public static void main(String []args){
//        MotorCycle M=new MotorCycle();
//    }
//}

//
//import java.util.*;
//
//
//class Student{}
//class Rockstar{   }
//class Hacker{}
//
//
//public class InstanceOFTutorial{
//
//    static String count(ArrayList mylist){
//        int a = 0,b = 0,c = 0;
//        for(int i = 0; i < mylist.size(); i++){
//            Object element=mylist.get(i);
//            if(element instanceof Student)
//            a++;
//            if(element instanceof Rockstar)
//            b++;
//            if(element instanceof Hacker)
//            c++;
//        }
//        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
//        return ret;
//    }
//
//    public static void main(String []args){
//        ArrayList mylist = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int i=0; i<t; i++){
//            String s=sc.next();
//            if(s.equals("Student"))mylist.add(new Student());
//            if(s.equals("Rockstar"))mylist.add(new Rockstar());
//            if(s.equals("Hacker"))mylist.add(new Hacker());
//        }
//        System.out.println(count(mylist));
//    }
//}

import java.util.*;
public class hackereank{

    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)//Hints: use instanceof operator

                break;
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}






