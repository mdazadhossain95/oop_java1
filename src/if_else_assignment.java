import java.util.Scanner;
public class if_else_assignment {

    public static void main (String[] args){
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


    }
}
