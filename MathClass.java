public class MathClass {
    public static void main(String[] args) {
        int a = 33, b = 37;
        
        // max / min
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        // random
        System.out.println(Math.random()); // returns a long data typed value (0, 1)
        System.out.println((int)(Math.random()*100));
    }
}
