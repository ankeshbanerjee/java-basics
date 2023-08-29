public class Casting {
    public static void main (String[] args){
        double price = 100.00;
        double fixedPrice = price + 18; // implicit casting -> java automatically converts int to double
        // coz, int being smaller in size, it can automatically be stored in bigger sized double data type
        System.out.println(fixedPrice);

        int p = 100;
        // int fp = p + 18.18; // this shows error, coz, java cannot convert double (8 byte) data type of int (4 byte) by itself
        // coz, bigger sized double cannot be stored in smaller sized int by java. we have to do it manually
        // so, we have to convert double to int, by ourself, with a cost of losing some data
        int fp = p + (int)18.99;  // explicit casting
        System.out.println(fp);
    }
}
