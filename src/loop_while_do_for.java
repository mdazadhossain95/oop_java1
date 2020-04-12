import java.util.Scanner;
public class loop_while_do_for {

    //IF/Else statements in lecture 2 and then try to code 4 operations so that the program

    // ask for input from the user and when

    // the user inputs 1 then the program output would be addition, 2 for multiplication,

    // 3 for subtracting and 4 for division. submit both tasks to me by using online platform for our study.

    //

    //

    public static void main (string[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.....");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("chose 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division ");
        int choice;
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println(num1 + num2);
        }
        else if(choice == 2){
            System.out.println(num1 * num2 );
        }
        else if(choice == 3){
            System.out.println(num1 - num2);
        }
        else{
            System.out.println(num1 / num2);
        }


    }}
