public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {99, 98, 91};
        // System.out.println(marks[5]); // this will throw exception and further code will not be executed
        // so, to handle exception, use try-catch
        // wrap those portion of code inside try, which can cause exception, and inside catch do something with the exceptions
        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("nice");
    }
}
