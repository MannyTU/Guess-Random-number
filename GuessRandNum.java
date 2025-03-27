import java.util.*;
import java.util.Random;
public class GuessRandNum {
    public static void main (String [] args){
        System.out.println("Try to guess my secret two-digit number, and I'll tell you how many digits from your guess appear in my number. \n Be smart! You can try at most 10 times.") ;
        Scanner input= new Scanner(System.in);
        Random rand = new Random ();
        int tries = 0;
        int number = rand.nextInt(99) + 10;
        int guess;
       System.out.print("your guess:" );
        guess = input.nextInt();
        while((guess>99 )|| guess<10){
            System.out.println("ERROR! Enter integer between 10 and 99.");
             System.out.print("your guess:" );
        guess = input.nextInt();
        }
        while((guess<= 99) || (guess >=10)){
            int num1 = number / 10;
            int num2 = number % 10;
            int guess1 = guess / 10;
            int guess2 = guess % 10;
            if ((guess1 == num1)&&(guess2 == num2)){
                System.out.println("Correct! You guessed my number in "+ tries+ " tries.");
                break;
            }else if ((guess1 != num1)&&(guess1 != num2)&&(guess2!=num1)&&(guess2!=num2)){
                System.out.println("Incorrect. Hint: 0 digits match");
                System.out.print("your guess:" );
        guess = input.nextInt();
        tries++;
            }else if ((guess1==num2)&&(guess2==num1)){
                System.out.println("Incorrect. Hint: 2 digits match");
                guess = input.nextInt();
                tries++;
            }else{
                System.out.println("Incorrect. Hint: 1 digit match");
                System.out.print("your guess:" );
                guess = input.nextInt();
                tries++;
            }
            }
    }
   
}