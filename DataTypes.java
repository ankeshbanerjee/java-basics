public class DataTypes {
    public static void main(String[] args) {
        // primitive data types 

        // byte (1 byte) [-128, 127]
        // short (2 byte)
        // int (4 byte)
        // long (8 byte)
        // float (4 byte)
        // double (8 byte)
        // char (2 byte)
        // boolean (1 byte)
        byte age = 30;
        int phone  = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        // Non-primitive data types
        // differences with primitive data types ->
        // it has particular functions/ methods
        // it doesn't have any fixed capacity for the input size
        // it is declared with new keyword
        String name = "abcd";
        String name2 = new String("abcde"); // optional to declare with new keyword
        System.out.println(name.length());
    }
}
