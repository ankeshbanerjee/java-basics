public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }

        // while loop
        int j = 1;
        while(j <= 100){
            System.out.println(j);
            j++;
        }

        // do while loop
        int k =1;
        do{
            System.out.println(k);
            k++;
        } while(k <= 100);

        // break and continue
        int l = 0;
        while (true){
            l++;
            if (l>5)
                break;
            if (l == 3)
                continue;
            System.out.println(l);
        }
    }
}
