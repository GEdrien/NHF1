import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("For the first commit");

        my_method();
    }

    static void my_method(){
        Random my_random = new Random();
        int x = my_random.nextInt(6)+1;
        System.out.println("Dice roll: " +  x);
    }
}
