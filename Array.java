import java.util.Arrays;    // import this package to use sort function

public class Array {
    public static void main(String[] args) {
        // declaration
        int[] marks = new int[3];
        // initialization
        marks[0] = 99;

        System.out.println(marks[0]);
        System.out.println(marks[1]); // declared but not initialized variables in java always contain values like null, 0, false etc.

        marks[1] = 95;
        marks[2] = 98;

        // length
        System.out.println(marks.length);   // in case of arrays, length is a property, not a method/function.
        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // declaration without 'new' keyword, if the content is already known
        int[] marks1 = {92, 93, 91};
        // 2d array
        int[][] marks2 = {{99, 92, 94}, {91, 90, 93}};
        System.out.println(marks2[0][0]);
        System.out.println(marks2[1][1]);
    }
}
