import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("For the first commit");
        Scanner my_scanner = new Scanner(System.in);

        char my_char = 'O';
        while(my_char != 'X'){
            my_method();
            System.out.println("Are you wants to quit? (X)");
            my_char = my_scanner.next().charAt(0);
        }
        System.out.println("Exit...");
    }

    static void my_method(){
        //Upgraded to 12 side dice
        Random my_random = new Random();
        int x = my_random.nextInt(12)+1;
        System.out.println("Dice roll: " +  x);
    }
}
