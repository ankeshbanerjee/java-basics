import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // creating object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("Enter your cgpa : ");
        float cgpa = sc.nextFloat();
        System.out.println(cgpa);
        // taking input of strings
        String name = sc.next();
        String fullName = sc.nextLine(); // to get full sentence input
        System.out.println(name);
        System.out.println(fullName);
    }
}
