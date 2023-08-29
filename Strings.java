public class Strings {
    public static void main(String[] args) {
        String name1 = "ankesh";
        String name2 = "sunny";
        // concatenation
        String name3 = name1 + " and " + name2;
        System.out.println(name3);
        // length
        System.out.println(name1.length());
        // charAt
        System.out.println(name1.charAt(0));
        // replace
        String name4 = name2.replace('n', 'm'); // it returns a new string, doesn't change the original one
        System.out.println(name4);
        System.out.println(name1); // original string is intact, coz, strings are immutable in java;
        // substring
        String name5 = name3.substring(1, 5); // [1, 4], last index is not inclusive
        System.out.println(name5);
    }
}
