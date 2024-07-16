
import java.util.Random;
import java.util.Scanner;


class Mainin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String play = "yes";
   
while(play.equals("yes"))
{
    Random ran = new Random();
    int randNum = ran.nextInt(100);
    int guess = -1;
    int tries = 0;
    
     while(guess != randNum)
     {
        System.out.println("Guess the number between 1 and 100: ");
         guess = sc.nextInt();
         tries++;


         if(guess == randNum)
         {
            System.out.println("Awesome! you guessed the number!");
            System.out.println("It only took you "+ tries+ " guesses!");
            double winrate =(double)tries / guess*100;
            System.out.printf("Your winrate is %.2f%%\n", winrate);
            System.out.println("Would you like to play again? yes or No: ");
            play = sc.next().toLowerCase();
        }
        else if(guess > randNum)
        {
            System.out.println("Your guess is too high , try again. ");

        }
        else 
        {
                System.out.println("Your guess is too low , try again. ");

        }
     }

     
     sc.close();
}
       }
 }
