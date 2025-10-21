import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        do {
            int die1 = random.nextInt(6) + 1;
            int die2 =  random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You Rolled: " +die1 + "+" +die2+ "=" +sum);
            if (sum == 2 || sum == 3 || sum == 4 || sum == 5 || sum == 6) {
                System.out.println("Craps! You Lose.");
            }else if (sum == 7 || sum == 11){
                System.out.println("You Win!");
            }else {
                int point = sum;
                System.out.println("Point is Set to: " +point);
                boolean rolling = true;
                
                while (rolling) {
                    die1 = random.nextInt(6) + 1;
                    die2 =  random.nextInt(6) + 1;
                    sum = die1 + die2;
                    System.out.println("You rolled: " +die1+ "+" +die2+ "=" +sum);
                    
                    if (sum == point){
                        System.out.println("You Win!");
                        rolling = false;
                    } else if (sum == 7) {
                        System.out.println("Natural! You Win.");
                        rolling = false;
                    }else {
                        System.out.println("Try for Point!..");
                    }
                }
            }
            System.out.print("Do You Want to Play Again? [Y/N]: ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");
        }while(playAgain);

        System.out.println("Thank You for Playing!!");
    }
}