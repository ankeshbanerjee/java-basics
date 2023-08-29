public class conditionalStatements {
    public static void main(String[] args) {

        // switch case
        int day = 1; // 1-> monday, 2-> tuesday
        System.out.println("without 'break' : ");
        switch(day){
            case 1: 
                System.out.println("monday");
            case 2:
                System.out.println("tuesday");
            default : 
                System.out.println("wed-sun");
        }
        
        System.out.println("with 'break' : ");
        switch(day){
            case 1: 
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default : 
                System.out.println("wed-sun");
        }

        // if else
        if (day == 1){
            System.out.println("monday");
        }
        else if (day == 2){
            System.out.println("tuesday");
        }
        else{
            System.out.println("wed-sun");
        }
    }
}
