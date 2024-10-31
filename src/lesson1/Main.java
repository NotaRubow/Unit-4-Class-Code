package lesson1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        guessMyNumber();
        Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random()*10+1);
        System.out.println("Guess my number between 1 and 10");
        int numberguessed = input.nextInt();
        while (numberguessed != secretNumber){
            System.out.println("Try Again!");
            numberguessed = input.nextInt();
        }
        System.out.println("Good Job!");
    }

    public static void guessMyNumber(){

    }
}
