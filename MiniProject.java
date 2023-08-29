import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        int target = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to start the game: (press -1 to quit at any moment)");
        int input = 0;
        while (true){
            input = sc.nextInt();
            if (input == -1){
                System.out.println("End");
                break;
            }
            if (input == target){
                System.out.println("Correct guess!");
                break;
            }
            else if (input < target)
                System.out.println("Please enter greater number please");
            else
                System.out.println("please enter smaller number please");
        }
    }
}
